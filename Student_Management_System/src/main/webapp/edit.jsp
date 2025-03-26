<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="homepage.css"/> 
<title>Register</title>
</head>


<body>

<header>
<div class="navbar">
<a href="#homepage.jsp" >Home</a>
<a href="login.jsp">Admin</a>
<a href="login.jsp">Login</a>
<a href="register.jsp">Register</a>
</div>

<div class="panel">
<p>Student Management</p> 
</div>
</header>
<div class="form1">
<form action="update" >
<h2>Edit</h2>
<div class="data">
<input type="hidden" name="rollno" value="${s.rollno}" >
Name: <input type="text" name="name" value="${s.name}"><br><br>
Address:<input type="text" name="addr" value="${s.email}"><br><br>
Email:<input type="text" name="email" value="${s.addr}"><br><br>
Password:<input type="text" name="password" value="${s.password}"><br><br>
<div class="button">
<input type="submit" value="Update"><br>
</div></div>
</form>
</div>
</body>
</html>