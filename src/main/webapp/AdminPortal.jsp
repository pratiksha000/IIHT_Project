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
       <h2>Welcome</h2><br><br>
       
       <a href="CourseForm.jsp">Add Course</a>
      <h2>Courses List</h2> 
     
      <table width="100%" border="1">
                       
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Description</th>
                            </tr>
                            <c:forEach items="${courses }" var="course">

                                <tr>
                                    <td>
                                        ${course.id}
                                    </td>
                                    <td>
                                        ${course.getName()}
                                    </td>
                                    <td>
                                        ${course.getDescription()}
                                    </td>
                                    
                                   
                                </tr>
                       

                    </table>
        </body>

        </html>