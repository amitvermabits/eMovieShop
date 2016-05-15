<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<%@ page import="com.calance.entity.Member" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>eMovieShop::Renting simplified</title>
	<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<div id="outer">
 		<div id="header">
 				<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
		</div>
<div id="content">
  
    <div id="secondaryContent">
     <div class="box">

<%if(session.getAttribute("user")!=null) { 

Member member = (Member)session.getAttribute("user");
%>

<p> Welcome <%= member.getUsername()  %></p>
Choose category :
<form action="CategoryController" method="post">
<select id="categories" size="1" name="categories">
	<option id="cat_movies" value="movies">Movies</option>
	<option id="cat_games" value="games">Games</option>
	<option id="cat_books" value="software">Software</option>
</select>
	
	
<input type="submit" value="Go">
</form>
		</div>
	</div>
<% } else { %>
 <p> You must be logged in to view this page </p>
<% }  %>

<!-- This section displays the results in the collection if any -->
<div id="primaryContentContainer">
 <div id="primaryContent">
  <div id="box">
			<c:if test="${collection !=null}">
			<div> 
			<form action="ShoppingCartController" method="post">
				 <jsp:include page="/WEB-INF/jsp/category/movies.jsp"></jsp:include>
			<input type="submit" value="Add To Cart" name="addToCart">
			</form>
			</div>
			</c:if>
		</div>
	</div>
	</div>
</div>
<div class="clear"/>
<div id="footer">
 				<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
		</div>
</div>
</body>
</html>