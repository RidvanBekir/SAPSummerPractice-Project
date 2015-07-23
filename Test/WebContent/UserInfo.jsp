<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><font color = "white">Living healthy for life</font></title>
<style>
html {
background: url(Photos/background.jpg) no-repeat center center fixed;
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
}
</style>
</head>
<body>
 <%@ include file="Header.jsp" %>
 <%@ include file="Menu.jsp" %>


<br></br> 
<br></br>
<br></br>

<center><h1><b>User Info</b></h1></center>

<br></br>
<form action = "UserInfo" method = "post" >

<center><table>
<tr>
<td><b>Gender:</b></td>
<td><select name="Gender">
<option>Male</option>
<option>Female</option>
</select></td>
</tr>


<tr><td><b>Weight(in kilograms):</b></td><td><input type="number" name="weight"/></td></tr>
<tr><td><b>Height (in santimeters):</b></td><td><input type="number" name="height"/> </td></tr>
<tr><td><b>Age:</b></td><td><input type="number" name="age"/> </td></tr>
