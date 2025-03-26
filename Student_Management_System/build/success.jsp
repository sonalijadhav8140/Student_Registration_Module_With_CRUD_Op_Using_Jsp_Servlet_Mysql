<%@page import="com.sit.model.Student"%>
<%@page import="java.util.Base64"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="homepage.css"/> 
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<header>
<div class="navbar">
<a href="#" >Home</a>
<a href="login.jsp">Admin</a>
<a href="login.jsp">Login</a>
<a href="register.jsp">Register</a>
</div>
<div class="panel1">
<div class="panel">
<h1>Student Management</h1>
<div class="box-container">

</header>


<p>Student Management</p> <br>
<table>
<%
List<Student> list1=(List<Student>)request.getAttribute("Customer");
if(list1!=null && !list1.isEmpty()){
	for(Student c:list1){
%>

   
<tr>
<th>Employee No</th>
<th> Name</th>
<th> Email</th>
<th> Address</th>
<th> Password</th>
</tr>
<tr>
<td><%= c.getRollno()%></td>
<td> <%= c.getName()%></td>
<td><%=c.getEmail() %></td>
<td><%= c.getAddr() %><td>
<td><%= c.getPassword() %>

 <th>
</div>
<% }
	%>
	</div>
	</div>
	
	<% 
}

%>
</table>
</div>


 </div>
</body>
</html>