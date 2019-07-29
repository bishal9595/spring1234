<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find a Trainee</title>
</head>
<body>
<div>
<h2>Retrieve Operation</h2>
<form action="retrieve-trainee" method="post">
<table>
<tr>
<td>Trainee Id</td>
<td><input type="number" name="traineeId" value="${retrieve_traineeId}"></td>
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
<table>
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
<td>${retrieve_traineeId}</td>
<td>${retrieve_traineeName}</td>
<td>${retrieve_traineeDomain}</td>
<td>${retrieve_traineeLocation}</td>
</tr>
</tbody>
</table>
<br>
</div>
</body>
</html>