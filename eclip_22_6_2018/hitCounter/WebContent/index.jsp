<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-120927044-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'UA-120927044-1');
</script>


</head>
<body>
		<%!int hitCounter=0; %>
		<%
			hitCounter++;
			PrintWriter pw = response.getWriter();
			pw.println("total nguoi truy cap : " +hitCounter);
		%>
		
		<%
	    Integer hitsCount = 
	      (Integer)application.getAttribute("hitCounter");
	    if( hitsCount ==null || hitsCount == 0 ){
	       /* First visit */
	       out.println("Welcome to my website!");
	       hitsCount = 1;
	    }else{
	       /* return visit */
	       out.println("Welcome back to my website!");
	       hitsCount += 1;
	    }
	    application.setAttribute("hitCounter", hitsCount);
		%>
		<center>
		<p>Total number of visits: <%= hitsCount%></p>
		</center>
	<h1>trang index</h1>
	<form action="">
		<input type="text"></br>
		<input type="button" value="click">
	</form>
		
</body>
</html>