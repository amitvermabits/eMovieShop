<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css" />
<title>Biblio - Login</title>
</head>
<body>

<div id="outer">
 		<div id="header">
 				<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
		</div>
<div id="menu">
</div>
<div id="content">
  <div id="primaryContentContainer">
    <div id="primaryContent">
     <div class="box">

 	<h2>Welcome to eMovieShop</h2>
	  <div class="boxContent">
		<p> eMovieShop is a very easy to use site that gives you a summary of available Movies at the store
			and allows you to review, select and rent such items.</p>
	</div>
    </div>
	</div>
	</div>
	<div id="secondaryContent">
		<div class="box boxA">
			<div class="boxContent">
				<form action="LoginServlet" method="post">
					<div>	
 						<span>Username</span> <input class="text" type="text" name="username"><br/>
						<span> Password </span><input class="text" type="password" name="password"><br/>
						<input class="button" type="submit" value="Login">
					</div>
				</form>
			</div>
		</div>
	</div>
	
</div> 
<div class="clear"/>
 <div id="footer">
 <p>
 <jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include></p>
</div>
</div>

</body>
</html>