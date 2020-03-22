<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <form:form action="showUser"  modelAttribute="trainee" method="post"><!--modelattribute emp holds the object in which all the feilds are set-->
<form:label path="traineeid">trainee id</form:label>
<form:input path="traineeid" id="traineeid" type="text"></form:input><br>
<form:input path="traineename" id="traineename"></form:input>
<form:label path="traineename" type="text">trainee name</form:label><br>
<form:label path="traineedomain" type="text">domain</form:label><br>
<form:input path="traineedomain" id="traineedomain"></form:input>

<form:label path="traineelocation" type="text">location</form:label>
<form:input path="traineelocation" id="traineelocation"></form:input><br> --%>

<form:form action="showUser" modelAttribute="trainee" method="post">
<input type="text" name="traineeid"/>
<input type="text" name="traineename"/>
<input type="text" name="traineedomain"/>
<input type="text" name="traineelocation"/>
<input type="submit">
</form:form>

</body>
</html>