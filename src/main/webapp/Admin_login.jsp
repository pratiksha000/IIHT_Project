<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin login</title>
</head>
<body>
<h2 align=center>ADMIN LOGIN</h2><br><br>
<form action ="Adminlogin" method=post align=center>
Username:<input type="text" name="username"><br><br>
Password:<input type="password" name="password" ><br><br>
<input type = "submit" value="SUBMIT"><br><br>

<h3>If not a registered user?Please signup first</h3>
<a href="Admin_signup.jsp">SIGNUP</a>
</form>
</body>
</html>