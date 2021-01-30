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
<input type="text" name = "ename"> Enter employee name </input>
<button type = "submit"> Search</button>
</form>

 <%=request.getAttribute("EmployeeDetails")%>
</body>
</html>