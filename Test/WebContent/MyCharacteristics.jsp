<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.AppUser" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Characteristics</title>
</head>
<body>
<%AppUser user = null;
session = request.getSession();
session.getAttribute("user"); %>
<b>Your characteristics :</b>
<table>
   <tr>
      <td> UserName: <%= user.getUsername() %> </td>
   </tr>

   <tr>
      <td> FirstName: <%= user.getFirstName() %> </td>
   </tr>
   
    <tr>
      <td> LastName: <%= user.getLastName() %> </td>
   </tr>
  
   <tr>
      <td> Age: <%= user.getAge() %> </td>
   </tr>
   
      <tr>
      <td> Weight: <%= user.getWeight() %> </td>
   </tr>
   
   <tr>
      <td> Height: <%= user.getHeight() %> </td>
   </tr>
   
   <tr>
      <td> WorkOutPlan: <%= user.getWorkOutPlan() %> </td>
   </tr>
   
</table>
</body>
</html>