package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class introduce_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Introduce</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"vnt-main\" class=\"container\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"mid-content-top\">\n");
      out.write("                    <div class=\"titleL\"><h3>Giới thiệu</h3></div>\n");
      out.write("                    <div class=\"titleR\"></div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mid-content\">\n");
      out.write("                    <div class=\"the-content desc\"><p style=\"text-align: center;\"><img alt=\"1\" src=\"images/intro1.jpg\" style=\"width: 700px; height: 445px;\" /></p>\n");
      out.write("\n");
      out.write("                        <div class=\"style-box\">\n");
      out.write("                            <p><span style=\"font-size:20px;\">H</span>ơn 10 năm qua Kingsport đã thể hiện một cam kết kiên định trong hoạt động kinh doanh, đó là tập trung vào chất lượng sản phẩm lấy khách hàng là yếu tố cốt lõi để phát triển, với sự chính trực và quyết liệt. Bằng cách làm đúng theo cam kết này chúng tôi đã tạo dựng được uy tín hàng đầu tại Việt Nam trong lĩnh vực cung cấp thiết bị thể thao &amp; thiết bị chăm sóc sức khỏe thông minh.</p>\n");
      out.write("\n");
      out.write("                            <p><span style=\"line-height: 1.6em; font-size: 20px;\">V</span><span style=\"line-height: 1.6em;\">ì chúng tôi tin rằng cách chúng tôi kinh doanh cũng quan trọng như những kết quả mà chúng tôi đã đạt được, chúng tôi không ngừng phấn đấu để nâng cấp cũng như đẩy mạnh những chức năng đa dạng của mình và triển vọng mở rộng trên khắp lãnh thổ Việt Nam để xây dựng một doanh nghiệp có đóng góp cho cộng đồng và trách nhiệm với xã hội.</span></p>\n");
      out.write("\n");
      out.write("                            <p><span style=\"font-size:20px;\">C</span>uộc sống là một hành trình dài, có một sức khỏe tốt là hành trang vững vàng để bạn có thể tự tin bước đi trên hành trình ấy. Đó cũng chính là thông điệp mà chúng tôi muốn thông qua những sản phẩm của mình sẽ mang lại những giá trị tốt đẹp nâng cao chất lượng cuộc sống và tiện ích cho mọi người dân Việt Nam. Làm thế nào để mọi Gia Đình tại Việt Nam đều có thể sở hữu những sản phẩm chăm sóc sức khỏe chất lượng tốt nhất, đó là việc mà chúng tôi luôn nỗ lực không ngừng trong những năm qua.</p>\n");
      out.write("\n");
      out.write("                            <p style=\"text-align: center;\"><img alt=\"2\" src=\"images/intro2.jpg\" style=\"width: 700px; height: 394px;\" /></p>\n");
      out.write("           \n");
      out.write("\n");
      out.write("                            <p>.&nbsp;</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                     </div>\n");
      out.write("                </div>          \n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
