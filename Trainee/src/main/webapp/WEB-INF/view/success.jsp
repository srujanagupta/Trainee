%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page isELIgnored="false" %>
<h2>${TraineeEntity.traineename}</h2>
<!--equivalent to calling Employee.getusername()-->
<h3>${TraineeEntity.traineeid}</h3>
</body>
</html>