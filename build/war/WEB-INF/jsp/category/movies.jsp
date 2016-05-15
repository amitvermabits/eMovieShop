<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
	<link rel="stylesheet" type="text/css" href="styles.css" />
 </head>
<body>
<div class="boxContent">
	
				<table>
				<tbody>
						<tr>
						 <th>#</th><th>Name</th><th>Description</th><th>Release Date</th><th>Rating</th>
							<th>Rent Amount (INR)</th>
						</tr>
						
						<% int rowCount = 1; %>
						 <c:forEach items="${collection}" var="row"> 
						  <tr class="<%= rowCount%2==0?"rowA":"rowB" %>">
							<td><input type="checkbox" name="items" value="${row.id}"></td>
						   	<td>${row.name}</td>
							<td>${row.description}</td>
							<td>${row.rel_date}</td>
							<td>${row.rating}</td>
						    <td>${row.rent_amt}</td>
						  </tr>
							<% rowCount++; %>
						 </c:forEach>
				</tbody>
				</table>
</div>
</body>
</html>