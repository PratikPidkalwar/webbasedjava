<%@page import="com.model.StudentProgress"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Object msg=request.getAttribute("message");
		Object progressObject=session.getAttribute("progressReport");
		StudentProgress progress=(StudentProgress)progressObject;
		
	%>
	<h2><%=msg %>, Here is Your Progress !!</h2>
	<h2>Your Name: <%=progress.getName() %></h2>
	<h2>Your Total Marks: <%=progress.getTotalMarks() %></h2>
</body>
</html>