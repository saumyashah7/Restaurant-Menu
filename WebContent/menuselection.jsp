<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu - Home</title>
</head>
<body>

<form method="post" action="menucontroller">
<center> <h1> Select the Menu</h1></center>

<h4>Breakfast:</h4> BreakfastMenu

<h4>Lunch:</h4>
<input type="radio" name = "Lunch" value="Lunch Menu"> Lunch Menu
<input type="radio" name = "Lunch" value="Dinner Menu"> Dinner Menu<br/>

<h4>Dinner:</h4>
<input type="radio" name = "Dinner" value="Lunch Menu"> Lunch Menu
<input type="radio" name = "Dinner" value="Dinner Menu">Dinner Menu<br/>
<br/><br/>
<input type ="submit" value = "Set Menu">



</form>

</body>
</html>