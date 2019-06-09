<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">

<head>

<c:url value="/resources/images/img/product-img" var="img"/>
<c:url value="/resources/css/css" var="css"/>
<c:url value="/resources/js/js" var="js"/>
<c:url value="/resources/scss" var="scss"/>
<c:url value="/resources/fonts" var="fonts"/>
<c:url value="/resources/js/jquery" var="jq"/>
  <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>Gifts Ecommerce Template | Home</title>

    <!-- Favicon  -->
    <link rel="icon" href="${img}/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="${css}/core-style.css">
    <link rel="stylesheet" href="${css }/style.css">

</head>

<body>
    <!-- Search Wrapper Area Start -->
    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
                            <button type="submit"><img src="${img}/search.png" alt=""></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search Wrapper Area End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav (max width 767px)-->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="amado-navbar-brand">
                <a href="<c:url value="/"/>"><img src="${img}/logo.png" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>



 <!-- Header Area Start -->
        <header class="header-area clearfix">
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div class="logo">
                <a href="<c:url value="/"/>"><img src="${img}/logo5.png" alt=""></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                    <li class="active"><a href="<c:url value="/"/>">Home</a></li>
                    <li><a href="<c:url value="/shop"/>">Shop</a></li>
                    <li><a href="<c:url value="/product"/>">Product</a></li>
                    <li><a href="<c:url value="/cart"/>">Cart</a></li>
                    <li><a href="<c:url value="/checkout"/>">Checkout</a></li>
                     
                    
                </ul>
                
                <c1:if test="${pageContext.request.userPrincipal.name!=null}">
                <security:authorize access="hasROle('ROLE_ADMIN')"></security:authorize>
                </c1:if>
                
                Welcome ${pageContext.request.userPrincipal.name}
                
                <c1:if test="${pageContext.request.userPrincipal.name==null }">
                <a href="<c:url value= "/login" /> ">Login</a>
                <a href="<c:url value= "/signup" /> ">Signup</a>
                </c1:if>
                
                <c1:if test="${pageContext.request.userPrincipal.name!=null}">
                <a href="<c:url value = "/logout"/> ">Logout</a>
                </c1:if>
                
                
              
                 <ul>
                    <li class="active"><a href="<c:url value="/"/>">Admin</a></li>
                    <ul class="sub_menu"></ul>
                    <li><a href="<c:url value="/category"/>">category</a></li>
                    <li><a href="<c:url value="/product1"/>">product1</a></li>
                    <li><a href="<c:url value="/supplier"/>">supplier</a></li>
                    <li><a href="<c:url value="/users"/>">user</a></li>
                    
                </ul>
            </nav>
            <!-- Button Group -->
            <div class="amado-btn-group mt-30 mb-100">
                <a href="#" class="btn amado-btn mb-15">%Discount%</a>
                <a href="#" class="btn amado-btn active">New this week</a>
            </div>
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="<c:url value="/cart"/>" class="cart-nav"><img src="${img}/cart.png" alt=""> Cart <span>(0)</span></a>
                <a href="#" class="fav-nav"><img src="${img}/favorites.png" alt=""> Favourite</a>
                <a href="#" class="search-nav"><img src="${img}/search.png" alt=""> Search</a>
            </div>
            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            </div>
        </header>
        <!-- Header Area End -->