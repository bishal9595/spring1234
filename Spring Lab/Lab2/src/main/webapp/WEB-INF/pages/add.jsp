<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Trainee page</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
<form action="addtrainee" method="post" modelAttribute="trainee">
<table>
<tr>
<td>
Trainee ID : -
</td>
<td>
<input type="text" name="traineeId"/>
</td>
</tr>
<tr>
<td>
Trainee Name : -
</td>
<td>
<input type="text" name="traineeName"/>
</td>
</tr>
<tr>
<td>
Trainee Location : -
</td>
<td>
<input type="radio" value="Chennai" name="traineeLocation"/>Chennai
<input type="radio" value="Banglore" name="traineeLocation"/>Banglore
<input type="radio" value="Pune" name="traineeLocation"/>Pune
<input type="radio" value="Mumbai" name="traineeLocation"/>Mumbai
</td>
</tr>
<tr>
<td>
Trainee Domain : -
</td>
<td>
<select name="traineeDomain">
<option value="java">Java</option>
<option value="dotnet">.Net</option>
<option value="android">Android</option>
</td>
</tr>
<tr>
<td><input type="submit" value="Add Trainee"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>	
	

</body>
</html>