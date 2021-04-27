<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add comment</title>
</head>
<body>
<form method="post" action="CommentController">

<h4>Add Comment</h4> 

<input type="text" name="title" placeholder="Title"><br/>
<textarea name="description" placeholder="Description here..."></textarea>
<br/><br/>	
<input type ="submit" value = "Add Comment">

</form>
</body>
</html>