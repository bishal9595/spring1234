<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
<h2>Enter Trainee Details</h2>
<form action="add-trainee" method="post">
<table>

<tr>
<td>Trainee Id</td>
<td><input type="number" name="traineeId" required></td>
</tr>
<tr>
<td>Trainee Name</td>
<td><input type="text" name="traineeName" required></td>
</tr>
<tr>
<td>Trainee Domain</td>
<td>
<select name="traineeDomain"> 
<option value="Java"> Java</option>
<option value=".Net"> .Net</option>
<option value="SAP"> SAP</option>
<option value="Salesforce"> Salesforce</option>
</select>
</td>
</tr>
<tr>
<td>Trainee Location</td>
<td><input type="radio" name="traineeLocation" value="Mumbai" required>Mumbai
<input type="radio" name="traineeLocation" value="Pune" required>Pune
<input type="radio" name="traineeLocation" value="Chennai" required>Chennai
<input type="radio" name="traineeLocation" value="Bangalore" required>Bangalore
</td>
</tr>
<tr>
<td>

<input type="submit" value="Add Trainee">
</td>
<td>
<input type="Reset" value="Reset">
</td>
</tr>
</table>
</form>

<div>
<h4>${result}</h4>
</div>
</body>
</html>