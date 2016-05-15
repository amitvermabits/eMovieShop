<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>eMovieShop :: Shopping Cart</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<div id="outer">
 		<div id="header">
 				<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
		</div>

<div id="content">
  
    <div id="primaryContentContainer">
 		<div id="primaryContent">
		<div id="box">
		 <% if(session.getAttribute("shoppingCart") !=null) { %>
		
		<p> Shopping cart contents </p>
			<form action="ShoppingCartController" method="post">
			 
			 <jsp:include page="/WEB-INF/jsp/cart/cartItems.jsp" />
			 
			<input type="submit" value="Confirm" name="confirmCartItems"/>
			<input type="submit" value="Remove Items" name="removeItemsFromCart"/>
			
		</form>
		</div>
<%}else { %>
 <p> Your shopping cart is empty </p>
<%} %>
</div>
</div>


</div>
<div class="clear"></div>
<div id="footer">
 	<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
</div>
</div>
</body>
</html>