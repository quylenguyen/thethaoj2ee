package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Product;
import dao.ProductDAO;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>detail</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            Product product = new Product();
            String productID = "";
            if (request.getParameter("productID") != null) {
                productID = request.getParameter("productID");
                product = productDAO.getProduct(Long.parseLong(productID));
            }
            long categoryID = 0;
            if (request.getParameter("categoryID") != null) {
                categoryID = (long) Long.parseLong(request.getParameter("categoryID"));
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            int pages = 0, firstResult = 0, maxResult = 0, total = 0;
            if (request.getParameter("pages") != null) {
                pages = (int) Integer.parseInt(request.getParameter("pages"));
            }

            total = productDAO.countProductByCategory(categoryID);
            if (total <= 4) {
                firstResult = 1;
                maxResult = total;
            }else{
                firstResult = (pages - 1) * 4;
                maxResult = 4;
            }

            ArrayList<Product> listProduct = productDAO.getListProductByNav(
                    categoryID, firstResult, maxResult);
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"single\">\n");
      out.write("                    <div class=\"col-md-9 top-in-single\">\n");
      out.write("                        <div class=\"col-md-5 single-top\">\t\n");
      out.write("\n");
      out.write("                            <a href=\"optionallink.html\">\n");
      out.write("                                <img class=\"etalage_thumb_image img-responsive\" src=\"");
      out.print(product.getProductImage());
      out.write("\" alt=\"\" >\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                        </div>\t\n");
      out.write("                    <div class=\"col-md-7 single-top-in\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"single-para\">\n");
      out.write("                            <h4>");
      out.print(product.getProductName());
      out.write("</h4>\n");
      out.write("                            ");

                            for (Product p : listProduct) {
                            
      out.write("\n");
      out.write("                            <div class=\"para-grid\">\n");
      out.write("                                <span class=\"add-to\">$");
      out.print(product.getProductPrice());
      out.write("</span>\n");
      out.write("                                <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\t\t\t\t\t\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <h5>100 items in stock</h5>\n");
      out.write("                            <div class=\"available\">\n");
      out.write("                                <h6>Available Options :</h6>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Color:\n");
      out.write("                                        <select>\n");
      out.write("                                            <option>Silver</option>\n");
      out.write("                                            <option>Black</option>\n");
      out.write("                                            <option>Dark Black</option>\n");
      out.write("                                            <option>Red</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </li>\n");
      out.write("                 \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <p>");
      out.print(product.getProductDescription());
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"hvr-shutter-in-vertical \">More details</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <div class=\"content-top-in\">\n");
      out.write("                        <div class=\"col-md-4 md-col\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                <a href=\"single.jsp\"><img  src=\"images/mcb.jpg\" alt=\"\" /></a>\t\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp\">Máy Chạy Bộ BK-2017</a></h5>\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        <a href=\"single.jsp\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\n");
      out.write("                                        <p class=\"VND\"><span class=\"in-dollar\">&nbsp;&nbsp;&nbsp;&nbsp;10,999,000 VND</span>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 md-col\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                <a href=\"single.html\"><img  src=\"images/mcb1.jpg\" alt=\"\" />\t</a>\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp\">Máy Chạy Bộ BK-2016 </a></h5>\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        <a href=\"single.jsp\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\n");
      out.write("                                        <p class=\"VND\"><span class=\"in-dollar\">&nbsp;&nbsp;&nbsp;&nbsp;10,469,000 VND</span>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 md-col\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                <a href=\"single.html\"><img  src=\"images/mcb2.jpg\" alt=\"\" />\t</a>\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp\">Máy Chạy Bộ KungFu </a></h5>\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        <a href=\"single.jsp\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\n");
      out.write("                                        <p class=\"VND\"><span class=\"in-dollar\">&nbsp;&nbsp;&nbsp;&nbsp;10,669,000 VND</span>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                \n");
      out.write("                        <div class=\"fb-comments\" data-href=\"http://localhost:8080/WebXXX/single.jsp?productID=");
      out.print(productID);
      out.write("\" data-width=\"850\" data-numposts=\"5\"></div>    \n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"single-bottom\">\n");
      out.write("                        <h4>Danh Mục</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy Chạy Bộ</a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Xe Đạp Tập</a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Giàn Tạ Đa Năng</a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy Rung Giảm Cân</a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy Tập Phòng GYM</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"single-bottom\">\n");
      out.write("                        <h4>Phân Loại Sản Phẩm</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy Rung Toàn Thân</a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy Rung Đánh Bụng</a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy massage </a></li>\n");
      out.write("                            <li><a href=\"#\"><i> </i>Máy Chạy Bộ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
