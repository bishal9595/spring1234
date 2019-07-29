<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Retrieve all trainee</h1>


<table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.traineeId}</td>
<td>${item.traineeName}</td>
<td>${item.traineeLocation}</td>
<td>${item.traineeDomain}</td></tr></c:forEach>
</table>



</body>
</html>