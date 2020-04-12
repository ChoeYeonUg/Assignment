<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="/css/fontStyle.css" rel="stylesheet" type="text/css">
	<link href="/css/synopsisStyle.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<nav>
	<div>
		<a href="/LoginAction" class="sign" role="button">Sign In</a>
	</div>
</nav>

	<h1>s: <%=id %></h1>
	<div>
	<h1 class="theme">What will your verse be?</h1>
	<h2 class="paragraph">We don't read and write poetry because it's cute. <br>
	We read and write poetry because we are members of the human race. And the human race is filled with passion. <br>
	And medicine, law, business, engineering, these are noble pursuits and necessary to sustain life. <br>
	But poetry, beauty, romance, love, these are what we stay alive for.<br>
	- Dead Poets Society
	</h2>
	</div>
</body>
</html>