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

<body style="counter-reset:section;text-align:center;background:#E7DFDE;">
<div class="contain" style="height:800px;">

 <c:url var="add" value="/addCard"/>
<form:form action="${add}" method="post" modelAttribute="card">

<form:input type="hidden" path="cardId" />

<label>NAME ON CARD</label>
<form:input type="text" placeholder="NAME ON CARD" path="nameOnCard"/>
</br>

<label>CARD NUMBER</label>
<form:input type="text" placeholder="CARD NUMBER" path="cardNumber"/>
</br>

<label>EXPIRY DATE</label>
<form:input type="text" placeholder="MM/YY" path="expiryDate"/>
</br>

<label>CVV</label>
<form:input type="text" placeholder="CVV" path="cvv"/>
</br>

<input type="submit" value="Submit"/>

</form:form>


</div>
</body>

</html>
