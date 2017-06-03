
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Product</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
        <%
            ProductDAO productDAO = new ProductDAO();
            ArrayList<Product> listProduct = productDAO.getListProduct();
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Quản Lý Sản Phẩm</h3>
                    <a href="${root}/admin/insert_product.jsp">Thêm Sản Phẩm</a>
                    <table class="data">
                        <tr class="data">
                            <th class="data">STT</th>
                            <th class="data" width="100px">Mã Sản Phẩm</th>
                            <th class="data" width="100px">Loại Sản Phẩm</th>
                            <th class="data" width="100px">Tên Sản Phẩm</th>
                            <th class="data">Hình Ảnh</th>
                            <th class="data" width="100px">Giá Sản Phẩm</th>
                            <th class="data">Thông Tin Chi Tiết</th>
                            <th class="data" width="75px">Tùy Chọn</th>
                        </tr>
                        <%
                            int count = 0;
                            for(Product product : listProduct)
                            {
                                count++;
                        %>
                        <tr class="data">
                            <td class="data"><%=count%></td>     
                            <td class="data"><%=product.getProductID()%></td>
                            <td class="data"><%=product.getCategoryID()%></td>
                            <td class="data"><%=product.getProductName()%></td>
                            
                            <td class="data"><%=product.getProductPrice()%>&nbsp; VND</td>
                            <td class="data"><%=product.getProductDescription()%></td>
                            <td class="data" width="75px">
                                <center>
                                    <a href="${root}/admin/update_product.jsp?command=update&product_id=<%=product.getProductID()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                                <a href="${pageContext.request.contextPath}/ManagerProductServlet?command=delete&product_id=<%=product.getProductID()%>">Xóa</a>
                                </center>
                            </td>
                        </tr>
                        <%}%>

                    </table>
                </div>
                <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>


    </body>
</html>
