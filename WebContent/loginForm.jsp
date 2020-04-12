<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%	
	String msg = request.getParameter("msg"); // Login 실패 시 message 출력 
	String passQuery = request.getParameter("carpe");
	/*Session get */
	String id= (String)session.getAttribute("id");
	String chkCookie = request.getParameter("id");
	if(id!=null)
		response.sendRedirect("/synopsis.jsp");
	if(msg ==null)
		msg = "";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/css/loginFormStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1><%=msg%></h1>
<form action="/LoginAction" method="post">
  <div class="container">
    <label for="id"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="id" required>
    <label for="pw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pw" required>
     <input type="hidden" name="passQuery" value="<%=passQuery%>">  
    <button type="submit">Login</button>
    <!-- <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label> -->
  </div>

  <div class="container">
    <a href="/index.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
   <!--  <span class="psw"><a>Forgot password?<</span> -->
  </div>
</form>






</body>
</html>