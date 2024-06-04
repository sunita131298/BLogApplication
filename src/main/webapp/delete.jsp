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
  int id=(Integer) request.getAttribute("id");
%>
<h1>Are you sure that you want to delete this Blog</h1>

<div class="container">

<form action="delete" method="post">
<input type="hidden" name="id" value="<%=id%>">
<input type="submit" value="yes">
</form>

<form action ="list">
<input type="submit" value="no">
</form>
</div>

</body>
</html>