<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
html {
background: url(Photos/background_2.jpg) no-repeat center center fixed;
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body >
<%@ include file="Header.jsp" %>
<%@ include file="Menu.jsp" %>
<h1 align="center"><font color = "white">Welcome!</font></h1>
<form name=formMenu method=Post>
<center><input type="button" style="background-color:LightSeaGreen" value="Continue" onclick="openPage('Login.jsp')"/>
 </center></form>
 <center><h3><font color = "white">About us</font></h3></center>
<center><p><font color = "white">We are a team of university students. Our main reason for making this site is
to help people get fit.</font></p></center>
<center><font color = "white"><a href="https://prezi.com/nhi4ealcfci1/untitled-prezi/?utm_campaign=share&utm_medium=copy" target="_blank">Presentation of the app!</a></font></center>
<center><p><font color = "white">You can also help us by filling in our investigation in the link below.</font></p></center>
<center><font color = "white"><a href="https://www.surveymonkey.com/r/K3M2MQ5" target="_blank" >CLICK HERE!</a></font></center>
<script type="text/javascript">
function openPage(pageURL){
	window.location.href=pageURL;
}
</script>
</body>
</html>