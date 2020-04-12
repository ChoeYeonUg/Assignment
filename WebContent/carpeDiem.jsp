<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id= (String)session.getAttribute("id");
/* System.out.println("ssssss : " + id); */
	if(id==null)
		response.sendRedirect("/LoginAction");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/css/carpeStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<a href="/logout.jsp">Logout</a>      <a href="/index.jsp">Home</a>
	<h1>Carpe Diem!!!!</h1>
</body>
</html>