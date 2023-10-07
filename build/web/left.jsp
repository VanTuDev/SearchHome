

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <!-- Code hiển thị danh sách sản phẩm và sản phẩm nổi bật ở đây -->
    <!--    <div class="card bg-light mb-3">
            <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> SẢN PHẨM </div>
            <ul class="list-group category_block">
    <c:forEach items="${listCC}" var="o">
         cid 
        <li class="list-group-item text-white ${tag == o.cid ? " active": "" } "><a href="
                                                                                    category?cid=${o.cid}">${o.cname}</a></li>
    </c:forEach>
</ul>
</div>-->
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase">Thông tin người sở hữu</div>
        <div class="card-body">
            <img class="img-fluid" src=" ${detail.image}" alt="Avatar" />
            <p class="card-title"> Full Name:${detail.name} </p>
            <p class="card-text">Phone:${detail.name} </p>
            <p class="card-text">Email: ${detail.name}</p>
        </div>
    </div>
    <!--    <div class="card bg-light mb-3">
            <div class="card-header bg-success text-white text-uppercase">NỔI BẬT</div>
            <div class="card-body">
                <img class="img-fluid" src="${p.image}" />
                <h5 class="card-title">${p.name}</h5>
                <p class="card-text">${p.title}</p>
                <p class="bloc_left_price">${p.price} $</p>
            </div>
        </div>-->
</div>
