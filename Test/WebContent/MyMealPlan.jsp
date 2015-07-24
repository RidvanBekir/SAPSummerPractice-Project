<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MealPlan</title>
</head>
<body>
<table align="center" border="1"  width="90%">
<tr ><td align="center"  colspan="2"><b>Meal Plan</b></td></tr>
</table>
<br>
<table align="center" border="1"  width="90%">
<tr ><td align="center"  colspan="2"><b>Macros for the day.</b></td></tr>
	<tr>
    <td width="400">Macro</td>
     <td>Grams</td>
</tr>
<tr>
    <td width="400">Callories</td>
     <td><%= session.getAttribute("callories") %></td>
</tr>
<tr>
    <td width="400">Protein</td>
     <td><%= session.getAttribute("protein") %></td>
</tr>
<tr>
    <td width="400">Carbohydrates</td>
      <td><%= session.getAttribute("carbohydrates") %></td>
</tr>
<tr>
    <td width="400">Fats</td>
     <td><%= session.getAttribute("fats") %></td>
</tr>

</table>


<table align="center" border="1"  width="90%">
<tr ><td align="center"  colspan="2"><b>First Meal</b></td></tr>
<tr>
    <td width="400">Food</td>
     <td>Weight of food in grams</td>
     
     
</tr>
<tr>
    <td>Grilled chicken breast</td>
     <td><%= session.getAttribute("proteinGramms") %></td>
     
</tr>
<tr>
    <td>Steamed brown rice</td>
      <td><%= session.getAttribute("carbohydratesGramms") %></td>
     
</tr>
<tr>
    <td>Olive Oil</td>
      <td><%= session.getAttribute("fatsGramms") %></td>
     
</tr>

<tr ><td align="center"  colspan="2"><b>Second Meal</b></td></tr>
<tr>
    <td width="400">Food</td>
     <td>Weight of food in grams</td>
     
     
</tr>
<tr>
    <td>Grilled chicken breast</td>
     <td><%= session.getAttribute("proteinGramms") %></td>
     
</tr>
<tr>
    <td>Steamed brown rice</td>
      <td><%= session.getAttribute("carbohydratesGramms") %></td>
     
</tr>
<tr>
    <td>Olive Oil</td>
      <td><%= session.getAttribute("fatsGramms") %></td>
     
</tr>

<tr ><td align="center"  colspan="2"><b>Third Meal</b></td></tr>
<tr>
    <td width="400">Food</td>
     <td>Weight of food in grams</td>
     
     
</tr>
<tr>
    <td>Grilled chicken breast</td>
     <td><%= session.getAttribute("proteinGramms") %></td>
     
</tr>
<tr>
    <td>Steamed brown rice</td>
      <td><%= session.getAttribute("carbohydratesGramms") %></td>
     
</tr>
<tr>
    <td>Olive Oil</td>
      <td><%= session.getAttribute("fatsGramms") %></td>
         
</tr>
</table>
</body>
</html>