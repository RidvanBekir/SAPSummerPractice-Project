<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
html {
background: url(Photos/background.jpg) no-repeat center center fixed;
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
}
</style>

<title>Living healthy for life</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
<br></br>
<body>


<center><h1><font color = "white">It's the start that stops most people.Let's start with us.</font></h1></center>
<br></br>
<center><h2><font color = "white">Login to Web App</font></h2></center>

<form action= "Login" method="post">
<center><p><input type="text" name="username" ></p></center>
<center><p><input type="password" name="password"></p></center>
<center><input type = "submit" name= "Log In" VALUE="Log In"></center><br>
<center><input type = "submit" name= "Register" VALUE="Register"></center>><br>
</form>
<%@ include file="Footer.jsp" %>
</body>
</html> 