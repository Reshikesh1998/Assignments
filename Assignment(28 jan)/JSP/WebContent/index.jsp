<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "/WEB-INF/CustomTag.tld" prefix="ctag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<input type ="number"  name ="value" > enter number</input>
<button >submit</button>

<%! Integer s =1;%>
<%
if(s==null)
{
	s=1;
			}
	else
{
s =request.getParameter("value");

%>

<ctag:hello message="this is a attribute" factorial ="<%=s %>" > </ctag:hello>
</body>
</html>