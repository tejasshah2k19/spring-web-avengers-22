<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<h2>Signup</h2>

	<form action="saveuser" method="post">
		FirstName: <input type="Text" name="firstName" /><br> <br>
		Email:<input type="Text" name="email" /><br> <br> Password:
		<input type="password" name="password" /><br> <br> <input
			type="submit" value="Signup" />
	</form>

</body>
</html>