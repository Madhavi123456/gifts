<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="nav.jsp" %>

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
<!--  <div class="cart-table table-responsive mb--40"> -->
<!--                                 <table class="table"> -->
<!--                                     <thead> -->
<!--                                         <tr> -->
<!--                                             <th class="pro-thumbnail">Image</th> -->
<!--                                             <th class="pro-title">Product</th> -->
<!--                                             <th class="pro-price">Price</th> -->
<!--                                             <th class="pro-quantity">Quantity</th> -->
<!--                                             <th class="pro-subtotal">Total</th> -->
<!--                                         </tr> -->
<!--                                     </thead> -->
<!--                                     <tbody> -->
<%--                                     <c:forEach var="ord" items="${orderItems}"> --%>
 <!--                                         <tr> --> 
                                            
 <%--                                             <td class="pro-thumbnail"><a href="#"><img src="${img}/product/${ord.getProductsId()}.jpg" alt="Product"></a></td> --%> 
 <%--                                             <td class="pro-title"><a href="#">${ord.getProducts().getProductsName()}</a></td> --%> 
 <%--                                             <td class="pro-price"><span>${ord.getProducts().getPrice()}</span></td> --%> 
 <%--                                             <td class="pro-price"><span>${ord.getProducts().getQuantity}</span></td> --%> 
 <!--                                             <td class="pro-subtotal"><span>$</span></td> --> 
                                            
<!-- <!--                                         </tr> --> 
<%-- <%--                                      </c:forEach> --%> 
<!--                                     </tbody> -->
<!--                                 </table> -->
<!--                             </div> -->
<!--                                     <div class="cart-summary-wrap"> -->
                                        <h4>-----------THANK YOU------------- </h4>                                                                                                                     
                                 </div> 


</html>