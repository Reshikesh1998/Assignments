<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>

</head>
<body>



<form action="ControllerServlet">
<input type="number" name = eid> Enter eid</input>
<input type="text" name = ename>Enter employee name </input>
<input type="number" name = esal> Enter salary</input>
	<select name="operation">
    <option value="1">add Employee</option>
    <option value="2">Delete Employee</option>
    <option value="3">Update Employee</option>
      <option value="4">display Employees</option>
  </select>
  <input type="submit" value="Submit">
  
  <%=request.getAttribute("ListofEmployees")%>
</form>


</body>
</html>