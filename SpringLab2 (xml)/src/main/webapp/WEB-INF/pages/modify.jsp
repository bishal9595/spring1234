<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify a Trainee</title>
</head>
<body>
<div>
<h2>Update Operation</h2>
<form action="modify-trainee" method="post">
<table>
<tr>
<td>Trainee Id</td>
<td><input type="number" name="traineeId" value="${modify_traineeId}"></td>
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
<form action="modify-trainee-confirm" method="post">
<table >

<tr>
<td>Trainee Id</td>
<td><input type="text" name="modify_traineeId" value="${modify_traineeId}"></td>
</tr>
<tr>
<td>Trainee Name</td>
<td><input type="text" name="modify_traineeName" value="${modify_traineeName}"></td>
</tr>
<tr>
<td>Trainee Domain</td>
<td><input type="text" name="modify_traineeDomain" value="${modify_traineeDomain}"></td>
</tr>
<tr>
<td>Trainee Location</td>
<td><input type="text" name="modify_traineeLocation" value="${modify_traineeLocation}"></td>
</tr>
</table>
<br>
<input type="submit" value="Update">
</form>
<h3>${modify_result}</h3>

</div>
</body>
</html>