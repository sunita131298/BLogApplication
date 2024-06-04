<%@page import="com.blogs.entity.Blog"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>Show blogs</h1>

	<a href="add-blog.jsp">add-blog</a>

	<hr>
	<%
	List<Blog> list=(List)request.getAttribute("list");
	for(Blog b:list){
	%>
	
	<h4>Blog Title:: <%= b.getTitle() %></h4>
	<p>Blog Description ::<%= b.getDescription() %> </p>
	<p>Blog DateAdded:: <%= b.getAddedDate() %> </p>
	<a href="update?id=<%= b.getId()%>"> Update+</a>
	<a href="delete?id=<%=b.getId() %>">Delete+</a>

<hr>

	<%
	}
	%>





</body>
</html>