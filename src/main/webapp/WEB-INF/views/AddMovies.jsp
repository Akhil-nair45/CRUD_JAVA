<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="/addmovies">
<h1>Welcome to movie registration page</h1>
Movie Name:<input type="text" name="mname">
Director:<input type="text" name="director">
Language:<input type="text" name="language">
<input type="submit" value="Register Movie">
</form>
<br><br>

<form action="/getmovies">
Language:<input type="text" name="language">
<input type="submit" value="Find Movies">
</form>
</body>
</html>