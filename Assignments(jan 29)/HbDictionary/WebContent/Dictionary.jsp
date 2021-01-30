<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Connector">
<input type = "text" name="word"> enter word </input>
<button type = "submit"> search</button>
</form>


<%=request.getAttribute("meaning") %>
</body>
</html>