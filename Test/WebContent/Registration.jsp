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

	<head>
		<title>Registration form</title>
	</head>
	<body>
	<%@ include file="Header.jsp" %>
    <%@ include file="Menu.jsp" %>
		<h1 align="center" ><font color = "white">Registration form</font></h1>
		<form action= "Registration" method="post">
		<table  align="center" >
		 	<tr>
				<td><label><font color = "white" >Username:</font></label></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><label><font color = "white">Password:</font></label></td>
				<td><input type="password" name="password" ></td>
			</tr>
			<tr>
				<td><label><font color = "white">Repeat Password:</font></label></td>
				<td><input type="password" name="repassword" ></td>
			</tr>
			<tr>
				<td><label><font color = "white" >First name:</font></label></td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td><label><font color = "white" >Last name:</font></label></td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td><label><font color = "white" >E-mail address:</font></label></td>
				<td><input type="text" name="email" ></td>
			</tr>
			<tr>
				<td><label><font color = "white">Age:</font></label></td>
				<td><input type="text"  name="age">
						
			</tr>
			<tr>
				<td><label><font color = "white">Gender:</font></label></td>
				<td><select name="gender">
						<option value="male" selected>Male</option>
						<option value="female">Female</option>
						</select>
			</tr>
			
			
        <tr><td><input type = "submit" name= "Registration" VALUE="Registration"></td></tr>
		</table>	
		</form>
		<br>
		<%@ include file="Footer.jsp" %>
	</body>
</html>