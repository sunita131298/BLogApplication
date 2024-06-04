<%@page import="com.blogs.entity.Blog"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.blogs.util.HibernateUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	int id = (Integer) request.getAttribute("id");
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session ss = factory.openSession();
	Blog b = ss.get(Blog.class, id);
	%>

	<h1>Update blog</h1>
	<a href="list"> show blog</a>
	<br>
	<br>
	<form action="update" method="post">
<input type="hidden" name="id" value="<%=b.getId()%>">

		Update Title::<input type="text" name="title" value="<%=b.getTitle()%>"> <br>
		Update Description::<input type="text" name="description" value="<%=b.getDescription()%>"><br>
		<br> <input type="submit" values="updateblog">


	</form>
</body>
</html>