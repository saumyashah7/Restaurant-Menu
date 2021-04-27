<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Breakfast: </h2> ${mn.getBreakfast()}<br/>
<h2>Lunch: </h2> ${mn.getLunch()}<br/>
<h2>Dinner: </h2> ${mn.getDinner()}<br/>
<button class = "btn btn-primary" onclick="window.location.href = 'menuselection.jsp'">Back</button>
</body>
</html>