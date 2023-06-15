<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/add">
<h1>Welcome to home page</h1>
Id: <input type="number" name="id">
Name: <input type="text" name="name">
Mobile no: <input type="number" name="mobile">
Email : <input type="email" name="email">
Age: <input type="number" name="age">
<input  type="submit" value="Register">
</form>




<form action="/get">
Name:<input type="text" name="name">
<input type="submit" value="Find">
</form>



<form action="/getall">
Id:<input type="number" name="id">
<input type="submit" value="Find">
</form>

<a href="AddMovies">Click here to Register Movies</a>
</body>
</html>