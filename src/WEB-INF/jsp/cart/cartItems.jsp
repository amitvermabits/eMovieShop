<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.calance.entity.Movie" %>
<%@ page import="com.calance.entity.ShoppingCart" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<% 
		ShoppingCart shoppingCart = (ShoppingCart)request.getSession().
											getAttribute("shoppingCart"); 
		Set<Movie> movies = shoppingCart.getMovieItems();
%>
<div class="boxContent">

		<table>
		<tbody>
		<tr>
		 <th>#</th><th>Item name </th> <th>Price</th>
		</tr>
		
		<% int rowCount = 1; %>
		<% for(Movie movie : movies){ %>
		
		<tr class="<%= rowCount%2==0?"rowA":"rowB" %>">
		 	<td><input type="checkbox" name="cartItems" value="<%= movie.getId() %>"></td>
		   	<td><%= movie.getName() %></td>
			<td><%= movie.getRent_amt() %></td>
		</tr>
		
		<% rowCount++; %>
		<% } %>
		<tr>
		 <td colspan="2"> Grand Total </td><td><%= shoppingCart.getGrandTotal() %></td>
		</tr>
		</tbody>
		</table>
</div>
</body>
</html>