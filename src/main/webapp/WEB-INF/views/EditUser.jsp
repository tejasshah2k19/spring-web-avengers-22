<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditUser</title>
</head>
<body>


	<form action="updateuser" method="post" autocomplete="off">
		<input type="hidden" name="userId" value="${user.userId}">


		FirstName: <input type="Text" name="firstName"
			value="${user.firstName}" /> <br> <br> Email:<input
			type="Text" name="email" value="${user.email}" /> <br> <br>
		Password: <input type="password" name="password"
			value="${user.password}" /> <br> <br> <br> <input
			type="submit" value="Update User" />
	</form>
</body>
</html>