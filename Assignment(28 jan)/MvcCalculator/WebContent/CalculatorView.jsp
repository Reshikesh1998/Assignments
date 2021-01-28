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
<input type="number" name = First_number> enter number </input>
<input type="number" name = Second_number>enter number </input>
	<select name="operation">
    <option value="1">add</option>
    <option value="2">sub</option>
    <option value="3">mul</option>
      <option value="4">div</option>
  </select>
  <input type="submit" value="Submit">
  
  <%=request.getAttribute("Answer")%>
</form>


</body>
</html>