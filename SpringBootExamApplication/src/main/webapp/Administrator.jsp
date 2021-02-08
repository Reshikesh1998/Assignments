<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> student add</p>
<form action="other" method="post">
<p> operations</p>
 
<p>Name</p>
<input type="text" name="name" />

<p>password</p>
<input type="password" name="pass"> 

<p>Designation</p>
<input type="text" name="designation"/>

<p>id</p>
<input type="number" name="id"/>

<p>question no</p>
<input type="number" name="no"/>

 <label>action</label>

<select name="profile">
  <option value="None">None</option>
  <option value="student">Student</option>
  <option value="teacher">Teacher</option>
  <option value="question">questions</option>
</select>
<select name="options">
<option value="None">None</option>
  <option value="delete">delete</option>
  <option value="update">update</option>
  <option value="getone">getone</option>
  <option value="getall">all</option>
  
</select>
<input type="submit">
<% 
if(request.getAttribute("message")!= null){
String s = (String)request.getAttribute("message"); 
out.println(s);}
 %>



</form>

</body>
</html>