/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author Ta Tu
 */
public class ProductDAO {
    public ArrayList<Product> getListProduct() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setCategoryID(rs.getLong("category_id"));
            product.setProductName(rs.getString("product_Name"));
            product.setProductImage(rs.getString("product_Image"));
            product.setProductPrice(rs.getDouble("product_Price"));
            product.setProductDescription(rs.getString("product_Description"));
            list.add(product);
        }
        return list;
    }

    // get danh sách sản phẩm dựa vào mã danh mục
    public ArrayList<Product> getListProductByCategory(long category_id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product WHERE category_id = '" + category_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
    }

    // hiển thị chi tiết sản phẩm
    public Product getProduct(long productID) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product WHERE product_id = '" + productID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductDescription(rs.getString("product_description"));
        }
        return product;
    }

    // lấy danh sách sản phẩm
    public ArrayList<Product> getListProductByNav(long categoryID, int firstResult, int maxResult) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product WHERE category_id = '" + categoryID + "' limit ?,?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, firstResult);
        ps.setInt(2, maxResult);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
    }

    // tính tổng sản phẩm
    public int countProductByCategory(long categoryID) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT count(product_id) FROM product WHERE category_id = '" + categoryID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }
        return count;
    }

    //Thêm mới dữ liệu
    public boolean insertProduct(Product p) {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO product VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, p.getProductID());
            ps.setLong(2, p.getCategoryID());
            ps.setString(3, p.getProductName());
            ps.setString(4, p.getProductImage());
            ps.setDouble(5, p.getProductPrice());
            ps.setString(6, p.getProductDescription());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateProduct(Product p) {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE product SET category_id = ?, product_name = ?, product_image = ?, product_price = ?, product_description = ? WHERE product_id =?";
        
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, p.getCategoryID());
            ps.setString(2, p.getProductName());
            ps.setString(3, p.getProductImage());
            ps.setDouble(4, p.getProductPrice());
            ps.setString(5, p.getProductDescription());
            ps.setLong(6, p.getProductID());
            return ps.executeUpdate() == 1;
           
        }catch(SQLException ex){
          Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean deleteProduct(long product_id){
        Connection connection = DBConnect.getConnection();
        String sql = "DELETE FROM product WHERE product_id =?";
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, product_id);
            return ps.executeUpdate() == 1;
        }catch (SQLException ex){
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
//        for (Product p : dao.getListProductByCategory(3)) {
//            System.out.println(p.getProductID() + " - " + p.getProductName());
//        }
//        for (int i = 1; i < 3; i++) {
//            dao.insertProduct(new Product(12, 3, "product2", "images/pi3.jpg", 13, "fugiat "));
//       }
  //      System.out.println(dao.countProductByCategory(1));
//        System.out.println(dao.updateProduct(new Product(1,2,"Huy","images/pi3.jpg",69,"DakLak")));
//          System.out.println(dao.deleteProduct(12));
    }

}
