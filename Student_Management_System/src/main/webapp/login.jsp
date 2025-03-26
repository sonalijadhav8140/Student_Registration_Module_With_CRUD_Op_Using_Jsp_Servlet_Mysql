<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="homepage.css"/> 
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

<header>
<div class="navbar">
<a href="homepge.jsp" >Home</a>
<a href="#">Contact us</a>
<a href="login.jsp">Login</a>
<a href="register.jsp">Register</a>
</div>

<div class="panel">
<p>Student Management</p> 
</div>
</header>
<div class="form1">
<form action="log" method="post">
<h2>Login</h2>
<div class="data">
<p>Email:</p><input type="email" name="email"><br><br>
<p>Password:</p><input type="password" name="password"><br><br>
<div class="button">
<input type="submit" value="Login"><br><br>

<a href="register.jsp">Create Account</a>

<% String errorMessage = (String) request.getAttribute("errorMessage");
   if (errorMessage != null) { %>
    <p style="color: red;"><%= errorMessage %></p>
<% } %>

</div></div>
</form>
</div>




</body>
</html>