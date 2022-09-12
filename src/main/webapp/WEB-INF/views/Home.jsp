<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<%
		UserBean user = (UserBean) request.getAttribute("user");
	%>


	FirstName : ${user.firstName}
	<br> Email : ${user.email}
	<br> Password : ${user.password }
	<br> Gender: ${user.gender }
	<br> Hobby: ${user.hobby }
	<br> ------------------------------------

	<br> FirstName :
	<%=user.getFirstName()%><Br> Email :
	<%=user.getEmail()%><Br> Password :
	<%=user.getPassword()%>
	<br>Gender:<%=user.getGender()%>
	<br>Hobby:
	<%=user.getHobby()%>
</body>
</html>