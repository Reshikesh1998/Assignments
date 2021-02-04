<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="calculator">
<input type="number" name="firstnumber"/>
<input type="number" name="secondnumber"/>
<input type="text" name="operator">
<input type="submit">
</form>
<% Integer ans = (Integer)request.getAttribute("ans");
out.println(ans);
%>
</body>
</html>