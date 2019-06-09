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
    <title>Gifts Ecommerce Template | Shop</title>

    <!-- Favicon  -->
    <link rel="icon" href="${img}/favicon.ico">

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
                <a href="<c:url value="/"/>"><img src="${img}/logo5.png" alt=""></a>
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
                    <li><a href="<c:url value="/"/>">Home</a></li>
                    <li class="active"><a href="<c:url value="/shop"/>">Shop</a></li>
                    <li><a href="<c:url value="/product"/>">Product</a></li>
                    <li><a href="<c:url value="/cart"/>">Cart</a></li>
                    <li><a href="<c:url value="/checkout"/>">Checkout</a></li>
                </ul>
            </nav>
            <!-- Button Group -->
            <div class="amado-btn-group mt-30 mb-100">
                <a href="#" class="btn amado-btn mb-15">%Discount%</a>
                <a href="#" class="btn amado-btn active">New this week</a>
            </div>
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="<c:url value="/cart"/>"class="cart-nav"><img src="${img}/cart.png" alt=""> Cart <span>(0)</span></a>
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

        
       <div class="shop_sidebar_area">

            <!-- ##### Single Widget ##### -->
            <div class="widget catagory mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Catagories</h6>

                <!--  Catagories  -->
                <div class="catagories-menu">
                    <ul>
                        <li class="active"><a href="#">all</a></li>
                        <c1:forEach var="cat" items="${categories}">
                        <li><a href="<c:url value="/prouct1/${cat.getCatId()}"/>">${cat.getCatName()}</a></li>
                        </c1:forEach>
                       
                    </ul>
                </div>
            </div>

         
           

            <!-- ##### Single Widget ##### -->
            <div class="widget price mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Price</h6>

                <div class="widget-desc">
                    <div class="slider-range">
                        <div data-min="10" data-max="1000" data-unit="$" class="slider-range-price ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all" data-value-min="10" data-value-max="1000" data-label-result="">
                            <div class="ui-slider-range ui-widget-header ui-corner-all"></div>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                        </div>
                        <div class="range-price">$10 - $10000</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="amado_product_area section-padding-100">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">
                            <!-- Total Products -->
                            <div class="total-products">
                                <p>Showing 1-8 0f 25</p>
                                <div class="view d-flex">
                                    <a href="#"><i class="fa fa-th-large" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
                                </div>
                            </div>
                            <!-- Sorting -->
                            <div class="product-sorting d-flex">
                                <div class="sort-by-date d-flex align-items-center mr-15">
                                    <p>Sort by</p>
                                    <form action="#" method="get">
                                        <select name="select" id="sortBydate">
                                            <option value="value">Date</option>
                                            <option value="value">Newest</option>
                                            <option value="value">Popular</option>
                                        </select>
                                    </form>
                                </div>
                                <div class="view-product d-flex align-items-center">
                                    <p>View</p>
                                    <form action="#" method="get">
                                        <select name="select" id="viewProduct">
                                            <option value="value">12</option>
                                            <option value="value">24</option>
                                            <option value="value">48</option>
                                            <option value="value">96</option>
                                        </select>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">

                    <!-- Single Product Area -->
                    <c1:forEach var="prod" items="${products}">
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="${img}/img2.jpg" alt="">
                                <!-- Hover Thumb -->
                                <img class="hover-img" src="${img}/product-img/img3.jpg" alt="">
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line"></div>
                                    <p class="product-price">${prod.getPrice()}</p>
                                    
                                        <h6><a href="<c:url value="/product1/${prod.getId()}"/>">${prod.getName()}</a></h6>
                                    
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    <div class="ratings">
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                    </div>
                                    <div class="cart">
                                        <a href="<c:url value="/addTocart/${prod.getId()}"/>" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/cart.png" alt=""></a>
                                         
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c1:forEach>

              
<!--                     Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img4.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img6.jpg" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$250</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Portraits</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
            
<!--                     Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img7.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img8.jpg" alt=""> --%>
                                
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$50</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Jewelleries</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>"data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->

<!--                     Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img9.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img10.png" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$65</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Watches</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>"data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->

<!--                     Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img11.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img14.jpg" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$55</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Cosmetics</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->

<!--                     Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/image15.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img23.jfif" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$20</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Bocque</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>"data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->

               
<!--                     <div class="col-12"> -->
<!--                         Pagination -->
<!--                         <nav aria-label="navigation"> -->
<!--                             <ul class="pagination justify-content-end mt-50"> -->
<!--                                 <li class="page-item active"> -->
<!--                               <a class="page-link" href="#">01.</a></li> -->

                                
<!--                                   Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img17.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img20.jpg" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$30</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Mugs</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->

<!--             Single Product Area -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img21.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img22.jpeg" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$50</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>Teddy Bear</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>" data-toggle="tooltip" data-placement="left" title="Add to Cart"></a><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->

<!--  <!-- Single Product Area --> -->
<!--                     <div class="col-12 col-sm-6 col-md-12 col-xl-6"> -->
<!--                         <div class="single-product-wrapper"> -->
<!--                             Product Image -->
<!--                             <div class="product-img"> -->
<%--                                 <img src="${img}/img24.jpg" alt=""> --%>
<!--                                 Hover Thumb -->
<%--                                 <img class="hover-img" src="${img}/img25.jpg" alt=""> --%>
<!--                             </div> -->

<!--                             Product Description -->
<!--                             <div class="product-description d-flex align-items-center justify-content-between"> -->
<!--                                 Product Meta Data -->
<!--                                 <div class="product-meta-data"> -->
<!--                                     <div class="line"></div> -->
<!--                                     <p class="product-price">$50</p> -->
<%--                                     <a href="<c:url value="/product"/>"> --%>
<!--                                         <h6>PullOver</h6> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 Ratings & Cart -->
<!--                                 <div class="ratings-cart text-right"> -->
<!--                                     <div class="ratings"> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                         <i class="fa fa-star" aria-hidden="true"></i> -->
<!--                                     </div> -->
<!--                                     <div class="cart"> -->
<%--                                         <a href="<c:url value="/cart"/>" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${img}/product-img/cart.png" alt=""></a> --%>
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--  c -->
<!--                                 <li class="page-item active"> -->
<!--                               <a class="page-link" href="#">02.</a></li> -->





                             
     
<!--                                  <li class="page-item"> -->
<!--                             <a class="page-link" href="#">03.</a></li> -->
<!--                                 <li class="page-item"><a class="page-link" href="#">04.</a></li> -->
<!--                             </ul> -->
<!--                         </nav> -->
<!--                     </div> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </div> -->
<!--     </div> -->
    <!-- ##### Main Content Wrapper End ##### -->

    

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer_area clearfix">
        <div class="container">
            <div class="row align-items-center">
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-4">
                    <div class="single_widget_area">
                        <!-- Logo -->
                        <div class="footer-logo mr-50">
                            <a href="<c:url value="/"/>"><img src="${img}/logo5.png" alt=""></a>
                        </div>
                        <!-- Copywrite Text -->
                        <p class="copywrite"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </div>
                </div>
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-8">
                    <div class="single_widget_area">
                        <!-- Footer Menu -->
                        <div class="footer_menu">
                            <nav class="navbar navbar-expand-lg justify-content-end">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                <div class="collapse navbar-collapse" id="footerNavContent">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="<c:url value="/"/>">Home</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="<c:url value="/shop"/>">Shop</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="<c:url value="/product"/>">Product</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="<c:url value="/cart"/>">Cart</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="<c:url value="/checkout"/>">Checkout</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
   
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