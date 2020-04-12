<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String msg = request.getParameter("msg");
	//cookie 얻기 
	Cookie[] cookies = request.getCookies();	
	if(cookies != null){
		/* cookie가 존재 시 synopsis page로 이동 */
		for(Cookie tmp: cookies){
			if(tmp.getName().equals("id"))
			response.sendRedirect("/synopsis.jsp");
		}
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/css/fontStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1><%=msg%></h1>
<form action="/LoginAction" method=post>
	 	ID : <input type="id" name="id" value="<%-- <%=coo%> --%>"><br>
	    PW : <input type="password" name="pw"><br>
	    <input type="hidden" name="test" value="<%-- <%=passURL%> --%>">
	    <input type = "checkbox" id = "chkID" name = "chkID"<%--  <%=check%>  --%> >
	     <label for="chkID"> ID 기억 </label><br>	    
	    <input type = "submit" value="로그인">
    </form>
</body>
</html>