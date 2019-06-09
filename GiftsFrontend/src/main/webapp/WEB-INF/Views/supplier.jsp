<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="nav.jsp" %>
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
    <title>Gifts Ecommerce Template | Checkout</title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="${css}/core-style.css">
    <link rel="stylesheet" href="${scss}/style.css">

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
                <a href="index.html"><img src="${img}/logo5.png" alt=""></a>
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
                <a href="index.html"><img src="${img}/logo5.png" alt=""></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                    <li><a href="<c:url value="/"/>">Home</a></li>
                    <li><a href="<c:url value="/shop"/>">Shop</a></li>
                    <li><a href="<c:url value="/product"/>">Product</a></li>
                    <li><a href="<c:url value="/cart"/>">Cart</a></li>
                    <li class="active"><a href="<c:url value="/checkout"/>">Checkout</a></li>
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

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="checkout_details_area mt-50 clearfix">

                            <div class="cart-title">
                                <h2>Supplier</h2>
                            </div>

                            <c:url value="/addsup" var="supplier"/>
                            <form:form action="${supplier}" method="post" commandName="supplier">
                                <div class="row">
                                    <div class="col-md-6 mb-3">
                                        <form:input type="text" class="form-control" id="first_name" value=""  path="name" placeholder="supplier Name" required="required"/>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <form:input type="text" class="form-control" id="last-name" value=""  path="supId" placeholder="supplier id" required="required"/>
                                    </div>
                                    <div class="col-12 mb-3">
                                        <form:input type="text" class="form-control" id="email" path="EmailId" placeholder="supplier email" value="" required="required"/>
                                    </div>
                                   
                                    </div>
                                    <div class="col-12 mb-3">
                                        <form:input type="text" class="form-control" id="street_address" path="Adddress" placeholder="supplier Address"/>
                                    </div>
                                   <input type="submit" value="Submit">  &nbsp;&nbsp; <input type="submit" value="Cancel">
                                   
                                    <div class="col-12">
                                        <div class="custom-control custom-checkbox d-block mb-2">
                                            <input type="checkbox" class="custom-control-input" id="customCheck2">
                                            <label class="custom-control-label" for="customCheck2">Create an account</label>
                                        </div>
                                        <div class="custom-control custom-checkbox d-block">
                                            <input type="checkbox" class="custom-control-input" id="customCheck3">
                                            <label class="custom-control-label" for="customCheck3">Ship to a different address</label>
                                        </div>
                                    </div>
                                </div>
                            </form:form>
                        </div>
                        
                          <div class="col-2 col-lg-12">
                        <div class="cart-summary">
                            <h5>Supplier Details</h5>
                            <ul class="summary-table">
                                <li><span><u>supplierId:</u></span> <span><u>supplierName</u></span>  <span><u>Actions</u></span></li>
                                <c1:forEach items="${Suppliers}" var="supplier">
                                <li><span>${supplier.getSupId()} </span>  <span>${supplier.getName()}</span> 
                                
                                <span> <a href="<c:url value="/editSupplier/${supplier.getSupId()}"/>"> Edit</a>/<a href="<c:url value="/deleteSupplier/${supplier.getSupId()}"/>">Delete</a>
	 								</span>
                                </c1:forEach>
                            </ul>

                     
                        </div>
                    </div>
                    </div>
 </div>
        </div>
    </div>
   
<%@include file="footer.jsp" %>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="${js}/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="${js}/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="${js}/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="${js}/plugins.js"></script>
    <!-- Active js -->
    <script src="${js}/active.js"></script>

</body>

</html>