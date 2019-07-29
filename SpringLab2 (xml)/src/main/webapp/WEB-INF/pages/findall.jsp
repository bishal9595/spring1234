<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainees Details</title>
</head>
<body>
<h2>Trainees Details</h2>
<table border="1">
<thead>
<tr>
<td>Trainee Id</td>
<td>Trainee Name</td>
<td>Trainee Domain</td>
<td>Trainee Location</td>
</tr>
</thead>

<c:if test="${not empty list }">
<c:forEach items="${list }" var="list">
<tr>
<td>${list.traineeId }</td>
<td>${list.traineeName }</td>
<td>${list.traineeDomain }</td>
<td>${list.traineeLocation}</td>
</tr>
</c:forEach>
</c:if>
</table>
</body>
</html>

