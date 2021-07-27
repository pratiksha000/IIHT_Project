<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <title>Delete course</title>
        </head>

        <body>
    	<form action ="deleteCourse" method=post >
    	<h2>Enter id of the course that is to be deleted</h2><br><br>
			Id:<input type="number" name="id"><br><br>
			<input type = "submit" value="SUBMIT"><br><br>

		</form>
        </body>

        </html>