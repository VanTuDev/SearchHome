<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <style>
            :root {
                --header-color: #151b49;
                --footer-color: #d2d6f4;
            }
            .card {
                width: 100%;
            }
            body {
                padding: 0px;
                margin: 0px;
                border: 0px;
            }

            .text-center{
                height: 60px;
                display: flex;
                align-items: center;
                background-color: #d2d6f4;
                ;
            }

            .row-header input{
                width: 520px;
                border-radius: 5px;
            }

            select{
                width: 130px;
                height: 30px;
                border-radius: 5px;
                padding: 0px;
                border-top: 0px;
                border-bottom: 0px;
                border-color: #151b49;
                border-style: unset;
            }

            .form-row{
                display: flex;
                justify-content: space-between;
                padding: 0px;
                margin: 0px;
            }

            button{
                display: flex;
                align-items: center;
                border-radius: 5px;
                color: #151b49;
                background-color: #d2d6f4;
                border: 0;
                font-size: larger;
            }

            span{
                padding: 0px 5px 0px 5px;
            }

            .content{
                padding: 10px;
            }

            .footer {
                background-color: var(--footer-color);

                margin: 0px ;
                padding: 20px 0px 0px 0px;
                box-sizing: content-box;
            }

            .foot-content{
                display: flex;
                justify-content: center;
            }
        </style>
    </head>

    <body>
        <!--begin of menu-->
        <nav class="menu navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Navbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand mr-auto" href="#"><img src="2x/logo@2x.png" height="30px"
                                                              width="19,69px"></a>
                <div class="collapse navbar-collapse" id="Navbar">
                    <c:if test="${sessionScope.acc.roles == 3}">
                        <ul class="navbar-nav mr-auto ">
                            <li class="nav-item active"><a class="nav-link" href="#">
                                    Quản lý tài khoản</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Quản lý bài đăng</a></li>
                        </ul>
                    </c:if>
                    <c:if test="${sessionScope.acc.roles == 2}">
                        <ul class="navbar-nav">
                            <li class="nav-item active"><a class="nav-link" href="#"><span
                                        class="fa fa-building fa-lg"></span>
                                    Căn hộ</a></li>
                            <li class="nav-item"><a class="nav-link" href="#"><span class="fa fa-home fa-lg"></span> Phòng
                                    trọ</a></li>
                        </ul>
                        <a class="nav-text" href="manager">Quản lý bài đăng</a>
                        <ul class="navbar-nav">
                            <li class="nav-text"><a class="nav-link" href="#">
                                    Đăng bài</a></li>
                        </ul>
                    </c:if>
                    <c:if test="${sessionScope.acc.roles == 1}">
                        <ul class="navbar-nav mr-auto ">
                            <li class="nav-item active"><a class="nav-link" href="#"><span
                                        class="fa fa-building fa-lg"></span>
                                    Căn hộ</a></li>
                            <li class="nav-item"><a class="nav-link" href="#"><span class="fa fa-home fa-lg"></span> Phòng
                                    trọ</a></li>
                        </ul>
                    </c:if>
                   <!-- login sign up -->
                    <!--<span class="navbar-text">
                        <h5>Hello + }</h5>
                        </span>-->
                    <c:if test="${sessionScope.acc == null}">
                        <ul class="navbar-nav mr-auto ">
                            <li class="nav-item active"><a class="nav-link" href="#"><span
                                        class="fa fa-building fa-lg"></span>
                                    Căn hộ</a></li>
                            <li class="nav-item"><a class="nav-link" href="#"><span class="fa fa-home fa-lg"></span> Phòng
                                    trọ</a></li>
                        </ul>
                        <span class="navbar-text">
                            <a href="#" style="color:gray">Guest</a>
                        </span>
                        <span class="navbar-text">
                            <a href="login.jsp">Login</a>
                        </span>
                        <span class="navbar-text">
                            <a href="register.jsp">Register</a>
                        </span>
                    </c:if>

                    <c:if test="${sessionScope.acc != null}">
                        <span class="navbar-text">
                            <a href="#" style="color:gray">${sessionScope.acc.fullname}</a>
                        </span>
                        <span class="navbar-text">
                            <a href="logout">Logout</a>
                        </span>
                    </c:if>
                </div>
            </div>
        </nav>
    <di class="text-center">
        <div class="container">
            <div class="row row-header">
                <div class="col-12 col-md-6" id="search-bar-container">

                    <input type="text" id="search-bar" placeholder="Nhập từ khóa">
                </div>
                <form action="search" method="post" class="form-row row col-12 col-md-6">
                    <div id="results"></div>
                    <div class="col-3 col-md-2">
                        <select id="location" name="location">
                            <option disabled selected>Địa điểm</option>
                            <option value="quan">Quận</option>
                            <option value="phuong">Phường</option>
                            <option value="duong">Đường</option>
                        </select>
                    </div>
                    <div class="col-3 col-md-2">
                        <select id="location" name="location">
                            <option disabled selected>Diện tích</option>
                            <option value="all">Tất cả diện tích</option>
                            <option value="">Dưới 20m&sup2;</option>
                            <option value="">20m&sup2; - 25m&sup2;</option>
                            <option value="">25m&sup2; - 30m&sup2;</option>
                            <option value="">30m&sup2; - 35m&sup2;</option>
                            <option value="">Trên 35m&sup2;</option>
                        </select>
                    </div>
                    <div class="col-3 col-md-2">
                        <select id="location" name="location">
                            <option disabled selected>Giá thành</option>
                            <option value="all">Tất cả diện tích</option>
                            <option value="">Dưới 1 triệu;</option>
                            <option value="">1 - 5 triệu;</option>
                            <option value="">5 - 10 triệu</option>
                            <option value="">10 - 15 triệu</option>
                            <option value="">Trên 15 triệu</option>
                        </select>
                    </div>
                    <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                </form>
            </div>
        </div>
    </di>
    <!--end of menu-->
    <div class="container">
        <div class="row">
            <div class="col">
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>
                        <!--                        <li class="breadcrumb-item"><a href="#">Category</a></li>
                                                <li class="breadcrumb-item active" aria-current="#">Sub-category</li>-->
                    </ol>
                </nav>
            </div>
        </div>
    </div>
    <div class="content container">
        <div class="row">
            <div class="col-sm-3">
                <div class="card bg-light mb-3">
                    <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> SẢN PHẨM
                    </div>
                    <ul class="list-group category_block">
                        <c:forEach items="${listCC}" var="o">
                            <!-- cid -->
                            <li class="list-group-item text-white ${tag == o.cid ? " active": "" } "><a href="
                                                                                                        category?cid=${o.cid}">${o.cname}</a></li>
                            </c:forEach>

                    </ul>
                </div>
                <div class="card bg-light mb-3">
                    <div class="card-header bg-success text-white text-uppercase">Nổi Bật</div>
                    <div class="card-body">
                        <img class="img-fluid" src="${p.image}" />
                        <h5 class="card-title">${p.name}</h5>
                        <p class="card-text">${p.title}</p>
                        <p class="bloc_left_price">${p.price} $</p>
                    </div>
                </div>
            </div>

            <div class="col-sm-9">
                <div class="row">
                    <!-- cái list của mình là cái iteam  listp -->
                    <c:forEach items="${listP}" var="o">
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="card">
                                <img class="card-imgs-top" src="${o.image}" alt="Card image cap">
                                <div class="card-body">
                                    <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                    <p class="card-text show_txt">${o.title}</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} $</p>
                                        </div>
                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Booking</a>
                                        </div>
                                        <!-- Thêm nút Yêu thích phòng -->                                    
                                        <div class="col">
                                            <a href="#" class="btn btn-link" onclick="toggleFavorite();">
                                                <i id="heart-icon" class="far fa-heart"></i>
                                            </a>
                                        </div>



                                    </div>
                                </div>
                            </div>
                        </div>


                    </c:forEach>
                </div>
            </div>

        </div>
    </div>

    <!-- Footer -->
    <footer class="footer">
        <div class="container">
            <div class="foot-content row">
                <div class="col-7 col-sm-6">
                    <h5>Our Address</h5>
                    <address>
                        FPT Urban Area<br>
                        Hoa Hai Ward<br>
                        Ngu Hanh Son District<br>
                        Da Nang City<br>
                        VietNam <br>
                        <i class="fa fa-phone fa-lg"></i>: +84 919280763<br>
                        <i class="fa fa-fax fa-lg"></i>: +84 919280763<br>
                        <i class="fa fa-envelope fa-lg"></i>:
                        <a href="mailto:confusion@food.net">shteam@service.com</a>
                    </address>
                </div>
                <div class="col-12 col-sm-6 align-self-center">
                    <div class="text-right">
                        <h5><strong>Contact us with</strong></h5>
                    </div>
                    <div class="text-right">
                        <a class="btn btn-social-icon btn-google" href="http://google.com/+"><i
                                class="fa fa-google-plus"></i></a>
                        <a class="btn btn-social-icon btn-facebook" href="http://www.facebook.com/profile.php?id="><i
                                class="fa fa-facebook"></i></a>
                        <a class="btn btn-social-icon btn-linkedin" href="http://www.linkedin.com/in/"><i
                                class="fa fa-linkedin"></i></a>
                        <a class="btn btn-social-icon btn-twitter" href="http://twitter.com/"><i
                                class="fa fa-twitter"></i></a>
                        <a class="btn btn-social-icon btn-google" href="http://youtube.com/"><i
                                class="fa fa-youtube"></i></a>
                        <a class="btn btn-social-icon" href="mailto:"><i class="fa fa-envelope-o"></i></a>
                    </div>
                </div>
                <p>
                    <a href="#">Back to top</a>
                </p>
            </div>
        </div>
    </footer>
</body>

</html>