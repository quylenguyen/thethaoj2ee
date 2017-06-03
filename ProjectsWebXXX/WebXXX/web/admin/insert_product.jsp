
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Product</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
        <script src="<c:url value="/ckeditor/ckeditor.js" />"></script>
        <script>
            $("#loaisp").find(":selected").val();
        </script>

    </head>
    <body>
        <%
            String error = "";
            if(request.getParameter("error")!=null){
                error = (String) request.getParameter("error");
            }
        %>

        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Thêm Sản Phẩm</h3>
                    <form action="${pageContext.request.contextPath}/ManagerProductServlet" method="post">
                    <table width="95%">
                        <tr><td><b>Tên Sản Phẩm</b></td><td><input type="text" class="sedang" name="tenSP"></td></tr>
                        <tr><td><b>Loại Sản Phẩm</b></td>
                            <td>
                                <select>
                                    <option selected id="loaisp">-- Chọn loại sản phẩm --</option>
                                    <option value="1" name="loaiSP">Máy Chạy Bộ</option>
                                    <option value="2" name="loaiSP">Xe Đạp Tập</option>
                                    <option value="3" name="loaiSP">Giàn Tạ Đa Năng</option>
                                    <option value="4" name="loaiSP">Máy Rung Giảm Cân</option>
                                    <option value="5" name="loaiSP">Máy Tập Phòng GYM</option>
                                    <option value="6" name="loaiSP">Dụng Cụ Thể Thao</option>
                                    <option value="7" name="loaiSP">Sản Phẩm Khác</option>
                                    
                                </select>
                                <script>
                                     $("#loaisp").find(":selected").val();
                                </script>
                            </td>
                        </tr>
                        <tr><td><b>Giá Bán</b></td><td><input type="text" class="sedang" name="giaSP"></td></tr>
                        <tr><td><b>Hình Ảnh</b></td><td><input type="file" name="hinhSP"></td></tr>
                        <tr><td><b>Mô Tả Sản Phẩm</b></td>
                            <td>
                                <textarea class="form-textarea" id="noiDung" name="motaSP">Xin mời bạn nhập miêu tả về sản phẩm!</textarea>
                                <script type="text/javascript" language="javascript">
                                   CKEDITOR.replace('noiDung', {width: '700px',height: '300px'});
                                </script>  
                            </td>
                        </tr>
                        <tr><td></td><td>
                                <input type="hidden" name="command" value="insert">
                                <input type="submit" class="button" value="Lưu dữ liệu">
                            </td></tr>
                    </table>
                </form>
            </div>
                <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>


    </body>
</html>
