<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getTempServlet"method="post">
	<label for="temperature">Enter a temperature to convert</label>
	<input id="temperature" type="number" step="0.1" name="temperature"size="5">
	<br>
	<label for="isF">Which are you converting to?</label>
	<select name="isF" id="isF">
  		<option value="true">Celsius</option>
  		<option value="false">Fahrenheit</option>
	</select>
	<input type="submit"value="Convert"/>
</form>
<br>
<a href="index.jsp">Back to home page</a>
</body>
</html>