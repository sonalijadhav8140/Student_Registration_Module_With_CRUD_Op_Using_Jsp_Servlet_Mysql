<%@page import="com.sit.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="homepage.css">
<title>Student Management</title>
</head>
<body>

<header>
    <div class="navbar">
        <a href="homepge.jsp">Home</a>
        <a href="#">Contact us</a>
        <a href="login.jsp">Login</a>
        <a href="register.jsp">Register</a>
    </div>
</header>

<!-- Student Management Panel -->
<div class="panel">
    <p>Student Management</p> 
</div>

<!-- This ensures the table is outside of the panel -->
<div class="container">
    <table border=1>
        <tr>
            <th>Roll No</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Password</th>
            <th>Edit+</th>
            <th>Delete</th>
        </tr>

        <% 
        List<Student> list = (List<Student>) request.getAttribute("AllData");
        if (list != null) { 
            for (Student s : list) { 
        %>
        <tr>
            <td><%= s.getRollno() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getAddr() %></td>
            <td><%= s.getPassword() %></td>
            <td><a href="edit?id=<%=s.getRollno()%>">Edit+</a>
            <td><a href="delete?id=<%=s.getRollno()%>">Delete+</a>
        </tr>
        <% 
            }
        } else { 
        %>
        <tr>
            <td colspan="5" style="text-align: center; color: red;">No student data available</td>
        </tr>
        <% } %>
    </table>
</div>

</body>
</html>
