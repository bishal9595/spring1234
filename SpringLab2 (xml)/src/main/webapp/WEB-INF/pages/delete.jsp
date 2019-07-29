<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete a Trainee</title>
</head>
<body>
<div>
<h2>Delete Operation</h2>
<form action="delete-trainee" method="post">
<table>
<tr>
<td>Trainee Id</td>
<td><input type="number" name="traineeId" value="${del_traineeId}"></td>
</tr>
<tr>
<td><input type="submit" value="Find Record"></td>
</tr>
</table>
</form>
</div>

<div>
<h3 style="color:red"> ${check_record} </h3>
</div>
<div>
<h3>Trainee Info</h3>
<form action="delete-trainee-confirm" method="post">
<table >
<thead>
<tr>
<td>Trainee Id</td>
<td>Trainee Name</td>
<td>Trainee Domain</td>
<td>Trainee Location</td>

</tr>
</thead>
<tbody>
<tr>
<td>${del_traineeId}</td>
<td>${del_traineeName}</td>
<td>${del_traineeDomain}</td>
<td>${del_traineeLocation}</td>
</tr>
</tbody>
</table>
<br>
<input type="hidden" value="${del_traineeId }" name="traineeId">
<input type="submit" value="Delete">
</form>
<h3>${del_result}</h3>

</div>
</body>
</html>