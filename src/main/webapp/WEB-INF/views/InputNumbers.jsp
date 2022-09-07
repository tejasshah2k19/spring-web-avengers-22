<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="calc" method="post">
		No.1 <input type="text" name="a" /><br> <br> No.2 <input
			type="text" name="b" /><br> 
			<br>
		Choice: <select name="operation">
			<option value="add">Addition</option>
			<option value="sub">Sub</option>
			<option value="mul">Mul</option>
		</select> <br><br>   <input type="submit" value="Add" />

	</form>
</body>
</html>