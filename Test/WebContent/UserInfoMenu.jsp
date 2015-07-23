<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserInfoMenu</title>
</head>
<body>
 <center><form NAME="form2" METHOD="POST">
 <input type="button" style="background-color:LightSeaGreen" value="My characteristics" 
 onclick="openPage('')"/>
<input type="button" style="background-color:LightSeaGreen" value="My workout plan" 
 onclick="openPage('')"/>
 <input type="button" style="background-color:LightSeaGreen" value="My meal plan" 
 onclick="openPage('')"/>
 <input type="button" style="background-color:LightSeaGreen" value="About us" 
 onclick="openPage('AboutUs.jsp')"/>
<input type="button" style="background-color:LightSeaGreen" value="Information" onclick="openPage('Information.jsp')"/>
</form></center>
<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
</body>
</html>