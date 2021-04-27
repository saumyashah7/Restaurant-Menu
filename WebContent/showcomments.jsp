<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comments</title>
</head>
<body>

	<div class = "container">
		
		<h1>Comments</h1>
		<hr/>
	
	
		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Id</th>
				<th>Title</th>
				<th>Description</th>
			</tr>
			
			<c:forEach items="${list}" var="comment">
			
				<tr>
					<td>${comment.id}</td>
					<td>${comment.title}</td>
					<td>${comment.description}</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
		<p>
			<button class = "btn btn-primary" onclick="window.location.href = 'commentform.jsp'">Add comment</button>
			<button class = "btn btn-primary" onclick="window.location.href = 'menuselection.jsp'">Home</button>
		</p>
		
	</div>

</body>
</html>