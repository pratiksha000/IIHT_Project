<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
</head>
<body>
<form action ="addStudent" method=post>
Firstname:<input type="text" name="firstname"><br><br>
Lastname:<input type="text" name="lastname"><br><br>
Username:<input type="text" name="username"><br><br>
Password:<input type="text" name="password" ><br><br>
Email_id:<input type="text" name="email_id"><br><br>
Address:<input type="text" name="address"><br><br>
Contact:<input type="number" name="contact"><br><br>
<input type = "submit" value="SUBMIT"><br><br>

<h3>If not a registered user?Please signup first</h3><br><br>
<a href="signup.jsp">SIGNUP</a>
</form>
</body>
</html>