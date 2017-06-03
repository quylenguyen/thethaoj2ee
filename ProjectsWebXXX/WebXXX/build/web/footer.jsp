<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>footer</title>
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

        <!---->
        <div class="footer">
            <!---->
            <div class="footer-middle">
                <div class="container">
                     <div class="footer-middle-in">
                        <h6>Về WebXXX</h6>
                        <ul>
                            <li><a href="#">Giới thiệu chung</a></li>
                            <li><a href="#">Tầm nhìn và sứ mệnh</a></li>
                            <li><a href="#">Định hướng phát triển</a></li>
                            <li><a href="#">Chính sách bảo mật</a></li>
                            <li><a href="#">Cam kết về thông tin</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Hướng dẫn</h6>
                        <ul>
                            <li><a href="#">Hướng dẫn mua hàng</a></li>
                            <li><a href="#">Tiêu chí bán hàng</a></li>
                            <li><a href="#">Hướng dẫn thanh toán</a></li>
                            <li><a href="#">Chính sách đổi trả</a></li>
                            <li><a href="#">Chính sách vận chuyển</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Customer Service</h6>
                        <ul>
                            <li><a href="contact.html">Dịch Vụ Khách Hàng</a></li>
                            <li><a href="#">Liên hệ với chúng tôi</a></li>
                            <li><a href="#">Bản đồ trang website</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Tài Khoản</h6>
                        <ul>
                            <li><a href="#">Thông tin tài khoản</a></li>
                            <li><a href="wishlist.html">Lịch sử đơn hàng</a></li>
                            <li><a href="#">Bản tin</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Extras</h6>
                        <ul>
                            <li><a href="#">Nhãn hiệu</a></li>
                            <li><a href="#">Gift Vouchers</a></li>
                            <li><a href="#">Đại lý</a></li>
                            <li><a href="#">Đặc biệt</a></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <p class="footer-class">WebXXX by nhóm 12</p>
            <script type="text/javascript">
                $(document).ready(function () {
                    /*
                     var defaults = {
                     containerID: 'toTop', // fading element id
                     containerHoverID: 'toTopHover', // fading element hover id
                     scrollSpeed: 1200,
                     easingType: 'linear' 
                     };
                     */

                    $().UItoTop({easingType: 'easeOutQuart'});

                });
            </script>
            <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
        </div>
    </body>
</html>