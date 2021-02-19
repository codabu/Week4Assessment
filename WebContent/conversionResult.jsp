<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion Result</title>
</head>
<body>
	<p>${userConversion.getAnswer()}</p>
	<br>
	<br>
	<a href="temp-converter.jsp">New Conversion</a>
	<br>
	<a href="index.jsp">Back to home page</a>
</body>
</html>