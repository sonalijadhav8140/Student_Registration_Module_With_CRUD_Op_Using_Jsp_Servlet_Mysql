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
<form action="reg" method="post">
<h2>Login</h2>
<div class="data">
Name: <input type="text" name="name"><br><br>
Address:<input type="text" name="addr"><br><br>
Email:<input type="text" name="email"><br><br>
Password:<input type="text" name="password"><br><br>
<div class="button">
<input type="submit" value="Register"><br>
<a href="login.jsp" >Already have a Account</a>

</div></div>
</form>
</div>
</body>
</html>