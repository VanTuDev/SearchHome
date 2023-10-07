<%--
    Document   : Detail
    Created on : Dec 29, 2020, 5:43:04 PM
    Author     : trinh
--%>

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
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            .gallery-wrap .img-big-wrap img {
                max-width: 100%;
                max-height: 450px;
                object-fit: contain;
                padding: 10px;
                margin: 0 auto;
            }

            .gallery-wrap .img-small-wrap .item-gallery img {
                max-width: 60px;
                max-height: 60px;
                object-fit: cover;
                margin: 5px;
            }
            .big-image{
                max-width: 100%    ;
                max-height: 1080px;

                display: flex;
                cursor: pointer; /* Biến đổi con trỏ thành hình bàn tay khi di chuột qua hình ảnh */
                transition: transform 1s; /* Tạo hiệu ứng khi phóng to */
            }
            .big-image:hover {
                transform: scale(1.2); /* Phóng to hình ảnh khi di chuột qua */
            }
            .small-image {
                max-width: 150px;
                max-height: 150px;
                cursor: pointer; /* Biến đổi con trỏ thành hình bàn tay khi di chuột qua hình ảnh */
                transition: transform 1s; /* Tạo hiệu ứng khi phóng to */
            }

            .small-image:hover {
                transform: scale(1.5); /* Phóng to hình ảnh khi di chuột qua */
            }

        </style>

    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                <jsp:include page="left.jsp"></jsp:include>
                    <div class="col-sm-9">
                        <div class="container">
                            <div class="card">
                                <div class="row">
                                    <aside class="col-sm-12 border-right" style="border: 0px; padding: 0px">
                                        <article class="gallery-wrap" >
                                            <div class="img-big-wrap" id="big-images">
                                            <div > <a href="#"> <img src="${detail.image}" class="big-image"> </a> </div>
                                        </div> 
                                        <div class="img-small-wrap" id="small-images">
                                            <img src="${detail.image1}" class="small-image">
                                            <img src="${detail.image2}" class="small-image">
                                            <img src="${detail.image3}" class="small-image">
                                            <img src="${detail.image4}" class="small-image">
                                            <img src="${detail.image5}" class="small-image">
                                        </div>
                                    </article> <!-- gallery-wrap .end// -->
                                </aside>
                                <aside class="col-sm-7">
                                    <article class="card-body p-5">
                                        <h3 class="title mb-3">${detail.name}</h3>
                                        <p class="price-detail-wrap">
                                            <span class="price h3 text-warning">
                                                <span class="currency">US $</span><span class="num">${detail.price}</span>
                                            </span>
                                        </p> <!-- price-detail-wrap .// -->
                                        <dl class="item-property">
                                            <dt>Description</dt>
                                            <dd><p>${detail.description}</p></dd>
                                        </dl>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <dl class="param param-inline">
                                                    <dt>Sản phẩm: </dt>
                                                    <div class="col-sm-12">
                                                        <span class="status">
                                                            <p>Còn phòng</p>
                                                            <p>Hết phòng</p>
                                                        </span>
                                                    </div>
                                                </dl>  <!-- item-property .// -->
                                            </div> <!-- col.// -->
                                        </div> <!-- row.// -->
                                        <hr>
                                        <a href="payment" class="btn btn-lg btn-primary text-uppercase"> Booking </a>
                                        <a href="datlich"  class="btn btn-lg btn-outline-primary text-uppercase">
                                            <i class="fas fa-shopping-cart"></i> Đặt Lịch  </a>
                                    </article> <!-- card-body.// -->
                                </aside> <!-- col.// -->
                            </div> <!-- row.// -->
                        </div> <!-- card.// -->
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
