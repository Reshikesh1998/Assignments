<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login">
<input type="text" name="uname"/>
<input type="password" name="upass"/>
<input type="submit"/>
<% String m =(String)request.getAttribute("message");
	out.println(m);
%>
</form>
</body>
</html>