<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<p>Questions</p>
<%
String  s = (String)request.getAttribute("message");
out.println(s);
%>
<select name="ans">
  <option value="A">A</option>
  <option value="B">B</option>
  <option value="C">C</option>
  <option value="D">D</option>
</select>
<button > <a href="forward">next</a></button>
<button > <a href="backward">previous</a></button>
</body>
</html>