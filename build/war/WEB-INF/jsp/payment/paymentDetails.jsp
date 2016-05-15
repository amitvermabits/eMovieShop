<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<%@ page import="java.util.*" %>
<%@ page import="com.calance.entity.BillDetails" %>
<%@ page import="com.calance.entity.RentDetails" %>
<%@ page import="com.calance.entity.Member" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>eMovieShop::Payment Details</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<%
		 		if(session.getAttribute("user") != null){ 
		  
		  		BillDetails billDetails = (BillDetails)session.getAttribute("billDetails");
		  		List<RentDetails> rentDetailsList = billDetails.getRentDetailList();
		  		Iterator rentItr = rentDetailsList.iterator();
		    	 Member member = ((Member)session.getAttribute("user"));
		    	 int itemCount = 1;
		     	Double grandTotal=0.0;
%>

<div id="outer">
 		<div id="header">
 				<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
		</div>
	
	<div id="content">
  
    <div id="primaryContentContainer">
 		<div id="primaryContent">
		<div id="box">
 		<div class="boxContent">
			 <table>
			 <tbody>
			 <tr><th>Name :</th> <th><%= member.getName() %></th> </tr>
			 <tr><td>Address :</td> <td><%= member.getAddress() %></td></tr>
			 <tr><td>Contact No :</td> <td><%= member.getContactNo() %></td></tr>
			 <tr><td>Sl. No</td><td>Item name</td><td>Rent amount</td><td>Due Date</td> 
			
 <% while(rentItr.hasNext()) {
 	
	  RentDetails rentDetails = (RentDetails)rentItr.next();
	 
 %>
  <tr class="<%= itemCount%2==0?"rowA":"rowB" %>">
  <td> <%= itemCount++ %></td>
  <td> <%= rentDetails.getItem_name() %></td>
  <td> <%= rentDetails.getRent_amt() %></td>
  <td> <%= rentDetails.getDue_date() %></td>
  <% grandTotal+= rentDetails.getRent_amt(); %>
</tr>
 

<%} %>
<tr><td colspan="3">Grand Total</td><td><%= grandTotal %></td>
<tr><td colspan="3">Service Tax @10.3%</td><td><%= billDetails.getService_tax()*grandTotal/100%>
<tr><td colspan="3">Net Payable</td><td><%= billDetails.getNet_payable() %></td>

 </tbody>
</table>

<form action="PaymentController">

 <p>Payment Amount : <input type="text" name="payAmount"></p>
  <p><input type="submit" name="payForItems" value="Pay"> 
</form>
</div>
<%} %>
</div>
</div>
</div>
<div class="clear"></div>

</div>
<div id="footer">
 				<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
		</div>
</div>
</body>
</html>