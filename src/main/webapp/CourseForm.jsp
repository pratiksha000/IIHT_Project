<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Form</title>
</head>
<body>
<h1>Course Form</h1>
<form action ="addCourse" method=post >
Name:<input type="text" name="name"><br><br>
Description:<input type="text" name="description"><br><br>
<input type = "submit" value="SUBMIT"><br><br>

</form>
</body>
</html>