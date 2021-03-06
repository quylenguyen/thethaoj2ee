<%@page import="model.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>detail</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <!--theme-style-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <!--//fonts-->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function () {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>

        <%
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
        %>

        <jsp:include page="header.jsp"></jsp:include>

            <div class="container">
                <div class="single">
                    <div class="col-md-9 top-in-single">
                        <div class="col-md-5 single-top">	

                            <a href="optionallink.html">
                                <img class="etalage_thumb_image img-responsive" src="<%=product.getProductImage()%>" alt="" >
                            </a>

                        </div>	
                    <div class="col-md-7 single-top-in">
                        
                        <div class="single-para">
                            <h4><%=product.getProductName()%></h4>
                            <%
                            for (Product p : listProduct) {
                            %>
                            <div class="para-grid">
                                <span class="add-to">$<%=product.getProductPrice()%></span>
                                <a href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>					
                                <div class="clearfix"></div>
                            </div>
                            <%}%>
                            <h5>100 items in stock</h5>
                            <div class="available">
                                <h6>Available Options :</h6>
                                <ul>
                                    <li>Color:
                                        <select>
                                            <option>Silver</option>
                                            <option>Black</option>
                                            <option>Dark Black</option>
                                            <option>Red</option>
                                        </select>
                                    </li>
                 
                                </ul>
                            </div>
                            <p><%=product.getProductDescription()%></p>

                            <a href="#" class="hvr-shutter-in-vertical ">More details</a>

                        </div>
                        
                    </div>
                    <div class="clearfix"> </div>
                    <div class="content-top-in">
                        <div class="col-md-4 md-col">
                            <div class="col-md">
                                <a href="single.jsp"><img  src="images/mcb.jpg" alt="" /></a>	
                                <div class="top-content">
                                    <h5><a href="single.jsp">Máy Chạy Bộ BK-2017</a></h5>
                                    <div class="white">
                                        <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
                                        <p class="VND"><span class="in-dollar">&nbsp;&nbsp;&nbsp;&nbsp;10,999,000 VND</span>
                                        <div class="clearfix"></div>
                                    </div>

                                </div>							
                            </div>
                        </div>
                        <div class="col-md-4 md-col">
                            <div class="col-md">
                                <a href="single.html"><img  src="images/mcb1.jpg" alt="" />	</a>
                                <div class="top-content">
                                    <h5><a href="single.jsp">Máy Chạy Bộ BK-2016 </a></h5>
                                    <div class="white">
                                        <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
                                        <p class="VND"><span class="in-dollar">&nbsp;&nbsp;&nbsp;&nbsp;10,469,000 VND</span>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>							
                            </div>
                        </div>
                        <div class="col-md-4 md-col">
                            <div class="col-md">
                                <a href="single.html"><img  src="images/mcb2.jpg" alt="" />	</a>
                                <div class="top-content">
                                    <h5><a href="single.jsp">Máy Chạy Bộ KungFu </a></h5>
                                    <div class="white">
                                        <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
                                        <p class="VND"><span class="in-dollar">&nbsp;&nbsp;&nbsp;&nbsp;10,669,000 VND</span>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>							
                            </div>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                    
                    <div>
                
                        <div class="fb-comments" data-href="http://localhost:8080/WebXXX/single.jsp?productID=<%=productID%>" data-width="850" data-numposts="5"></div>    
                            
                    </div>
                    
                </div>
                <div class="col-md-3">
                    <div class="single-bottom">
                        <h4>Danh Mục</h4>
                        <ul>
                            <li><a href="#"><i> </i>Máy Chạy Bộ</a></li>
                            <li><a href="#"><i> </i>Xe Đạp Tập</a></li>
                            <li><a href="#"><i> </i>Giàn Tạ Đa Năng</a></li>
                            <li><a href="#"><i> </i>Máy Rung Giảm Cân</a></li>
                            <li><a href="#"><i> </i>Máy Tập Phòng GYM</a></li>
                        </ul>
                    </div>
                    <div class="single-bottom">
                        <h4>Phân Loại Sản Phẩm</h4>
                        <ul>
                            <li><a href="#"><i> </i>Máy Rung Toàn Thân</a></li>
                            <li><a href="#"><i> </i>Máy Rung Đánh Bụng</a></li>
                            <li><a href="#"><i> </i>Máy massage </a></li>
                            <li><a href="#"><i> </i>Máy Chạy Bộ</a></li>
                        </ul>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
