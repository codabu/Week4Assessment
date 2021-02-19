<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<h1>Calculation Result</h1>
	<br>
	<p>${userCalculation.getOperand1()} ${userCalculation.getOperator()} ${userCalculation.getOperand2()} =</p>
	<br>
	<p>${userCalculation.getAnswer()}</p>
	<br>
	<br>
	<a href="calculator.jsp">New Calculation</a>
	<br>
	<a href="index.jsp">Back to home page</a>
</body>
</html>