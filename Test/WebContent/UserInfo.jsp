<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
html {
background: url(Photos/background_2.jpg) no-repeat center center fixed;
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
}
</style>
</head>
<body>
 <%@ include file="Header.jsp" %>
 <%@ include file="UserInfoMenu.jsp" %>

<center><h1><b><font color = "white">User Info</font></b></h1></center>

<br></br>
<form action = "UserInfo" method = "post" >
<center>
<table>
<tr><td><b><font color = "white">Weight(in kilograms):</font></b></td><td><input type="text" name="weight"/></td></tr>
<tr><td><b><font color = "white">Height (in centimeters):</font></b></td><td><input type="text" name="height"/> </td></tr>
<tr>
<td><b><font color = "white">Can you make 10 pull ups and 20 push ups:</font></b></td>
<td><select name="physic">
<option>Yes</option>
<option>No</option>
</select>
</td>
</tr>
</table>
<br>

<b><font color = "white">Input activity level</font></b>
<select name="ActivityLevel">
<option>Rarely exercise</option>
<option>Light exercise (1-3 hours)</option>
<option>Moderate exercise (3-5 hours)</option>
<option>Strenuous exercise  (5-6 hours)</option>
<option>Strenuous exercise  (7-21 hours)</option>
</select>
<br></br>

<b><font color = "white">What is your aim? </font></b>
<select name="Goal">
<option>Clean bulk</option>
<option>Gain muscle, lose fat</option>
<option>Lose fat - 5%</option>
<option>Lose fat - 10%</option>
<option>Lose fat - 15%</option>
<option>Lose fat - 20%</option>
<option>Lose fat - 25%</option>
</select>
<br>
</center>
<br>
<center><input type="submit" value="Submit" VALUE="Submit"/></center><br>
<center><input type="button" value="Discard changes" onclick="location.href='yourpage.html'" /></center>
</form>
<%@ include file="Footer.jsp" %>
   
</body>
</html> 