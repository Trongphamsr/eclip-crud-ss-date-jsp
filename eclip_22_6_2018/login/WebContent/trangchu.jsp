<%@page import="com.model.LoginModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		
	LoginModel l = null;
	 if(session.getAttribute("user")!=null){
         l=(LoginModel)session.getAttribute("user");
     }
	%>
	<%if(l!=null){
	%>
	<p><%=l.getUsername() %></p>
	<%} %>
	<a href="Login">logout</a>
</body>
</html>