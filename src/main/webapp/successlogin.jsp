<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <title>Admin Portal</title>
        </head>

        <body>
       <h2>Congratulations!You have successfully logged in.</h2><br><br>
       <a href="/AdminPortal">Display Courses</a>
       <br><br>
       <a href="CourseForm.jsp">Add Course</a>
       <br><br>
      <!-- Course deletion by taking url parameter
      <a href="/deleteCourse/${id}">Delete Course</a>
      -->
       <a href="deleteCourse.jsp">Delete Course</a>
       <br><br>
       <a href="CourseUpdate.jsp">Update Course</a>
       
        ${code}
        </body>

        </html>