<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<form action="getCalcServlet"method="post">
	<label for="operand1">Enter a number to perform an operation on</label>
	<input id="operand1" type="number" step="0.001" name="operand1"size="10">
	<br>
	<br>
	<label for="operator">Enter an operator - (eg * / - +)</label>
	<input id="operator" type="text"name="operator"size="1">
	<br>
	<br>
	<label for="operand2">Enter another number to perform an operation on</label>
	<input id="operand2" type="number" step="0.001" name="operand2"size="10">
	<br>
	<input type="submit"value="Calculate"/>
</form>
<br>
<a href="index.jsp">Back to home page</a>
</body>
</html>