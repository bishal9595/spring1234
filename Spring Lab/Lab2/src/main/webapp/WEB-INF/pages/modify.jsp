<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Modify Operation</h1>
<form action="modifytrainee" method="post" >
<table>
<tr>
<td>
Please enter trainee Id : -
</td>
<td>
<input type="text" name="traineeId"/>
</td>
</tr>
<td><input type="submit" value="Modify"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>	
<form action="modifytraineee" method="post" modelAttribute="trainee">
<table>
<tr>
<th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>
<tr>
<td><input type="text" value="${list.traineeId}" name="traineeId"/></td>
<td><input type="text" value="${list.traineeName}" name="traineeName"/></td>
<td><input type="text" value="${list.traineeLocation}"name="traineeLocation" /></td>
<td><input type="text" value="${list.traineeDomain}"name="traineeDomain" /></td>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
</form>
</body>
</html>