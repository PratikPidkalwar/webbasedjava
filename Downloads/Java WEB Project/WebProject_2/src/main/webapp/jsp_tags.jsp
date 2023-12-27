<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Demonstrating JSP Tags</h1>
	
	<%--Including the resources:  greeting.html   --%>
	<%@ include file="greeting.html" %>
	
	<%--  Adding some declarations --%>
	<%!
		int number=5;
		public String sayWelcome(String name)
		{
			return "Welcome"+name;
		}
	%>
	
	<%--  Printing HELLO 5 times using <h2> heading --%>
	
	<%
		for(int a=1;a<=5;a++){
	%>
	
		<h2>HELLO</h2>
		<%
			}
	
			LocalDate sysDate=LocalDate.now();
			LocalTime sysTime=LocalTime.now();
		%>
		
		<h2>Number Is : <%=number %>></h2>
		<h2>Squre Of : <%=number %> is : <%=(number*number) %></h2>
		<h2>Reply from Method is : <%=sayWelcome("Jason Bourne") %></h2>
		<h2>Current date : <%=sysDate %></h2>
		<h2>Current Time : <%=sysTime %></h2>
</body>
</html>