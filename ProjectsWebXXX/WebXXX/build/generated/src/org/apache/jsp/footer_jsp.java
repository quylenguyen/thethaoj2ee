package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>footer</title>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("                    $(function () {\n");
      out.write("                        $(\"#slider1\").responsiveSlides({\n");
      out.write("                            auto: true,\n");
      out.write("                            speed: 500,\n");
      out.write("                            namespace: \"callbacks\",\n");
      out.write("                            pager: true,\n");
      out.write("                        });\n");
      out.write("                    });\n");
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
      out.write("        <!---->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <!---->\n");
      out.write("            <div class=\"footer-middle\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                     <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Về WebXXX</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Giới thiệu chung</a></li>\n");
      out.write("                            <li><a href=\"#\">Tầm nhìn và sứ mệnh</a></li>\n");
      out.write("                            <li><a href=\"#\">Định hướng phát triển</a></li>\n");
      out.write("                            <li><a href=\"#\">Chính sách bảo mật</a></li>\n");
      out.write("                            <li><a href=\"#\">Cam kết về thông tin</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Hướng dẫn</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Hướng dẫn mua hàng</a></li>\n");
      out.write("                            <li><a href=\"#\">Tiêu chí bán hàng</a></li>\n");
      out.write("                            <li><a href=\"#\">Hướng dẫn thanh toán</a></li>\n");
      out.write("                            <li><a href=\"#\">Chính sách đổi trả</a></li>\n");
      out.write("                            <li><a href=\"#\">Chính sách vận chuyển</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Customer Service</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Returns</a></li>\n");
      out.write("                            <li><a href=\"#\">Site Map</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>My Account</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"account.html\">My Account</a></li>\n");
      out.write("                            <li><a href=\"#\">Order History</a></li>\n");
      out.write("                            <li><a href=\"wishlist.html\">Wish List</a></li>\n");
      out.write("                            <li><a href=\"#\">Newsletter</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Extras</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Brands</a></li>\n");
      out.write("                            <li><a href=\"#\">Gift Vouchers</a></li>\n");
      out.write("                            <li><a href=\"#\">Affiliates</a></li>\n");
      out.write("                            <li><a href=\"#\">Specials</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"footer-class\">Copyright © 2015 Modern Template by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    /*\n");
      out.write("                     var defaults = {\n");
      out.write("                     containerID: 'toTop', // fading element id\n");
      out.write("                     containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                     scrollSpeed: 1200,\n");
      out.write("                     easingType: 'linear' \n");
      out.write("                     };\n");
      out.write("                     */\n");
      out.write("\n");
      out.write("                    $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
