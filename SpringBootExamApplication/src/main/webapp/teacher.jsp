<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Welcome to the teacher page</p>


<form action="teacheroptions" method="post">
<p> operations</p>
 
<p>Name</p>
<input type="text" name="name" />

<p>id</p>
<input type="number" name="id"/>

<p>question no</p>
<input type="number" name="qno"/>

<p>To add questions</p>
 <label>Question</label>
<input type="text" name="problem"/>
 <label>option</label>
<input type="text" name="option1"/>
<label>option</label>
<input type="text" name="option2"/>
<label>option</label>
<input type="text" name="option3"/>
<label>option</label>
<input type="text" name="option4"/>

 <label>action</label>

<select name="profile">
   <option value="student">Student</option>
  <option value="questions">questions</option>
</select>
<select name="options">
<option value="add">Add</option>
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

</body>
</html>