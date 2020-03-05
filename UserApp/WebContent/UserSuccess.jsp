<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1">
<title>Success</title>
</head>
<body bgcolor="pink">
<div align="center">
<br>
<br>
<% String username = request.getParameter("username"); %>
<h1>Welcome <% out.println(username); %> !</h1>
 You have logged in.
<br><br>
Click Here To See All The <br>
<br>
<a href="list.jsp">Registered Users</a><br><br>
<br>
<br>
</div>
</body>
</html>