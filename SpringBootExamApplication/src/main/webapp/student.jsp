<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<button  > <a href="score">See Score</a></button>
<button ><a href="exam">See Score</a></button>
<p>Welcome to the student page</p>

<% if(request.getAttribute("message") !=null)
{ String s = (String) request.getAttribute("message");
out.println(s);
	} %>
</body>
</html>