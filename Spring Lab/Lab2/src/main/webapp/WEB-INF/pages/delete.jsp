<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Delete Operation</h1>
<form action="deletetrainee" method="post" >
<table>
<tr>
<td>
Please enter trainee Id : -
</td>
<td>
<input type="text" name="traineeId"/>
</td>
</tr>
<td><input type="submit" value="Delete"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>	
<form action="deletetrainee/${list.traineeId}" method="post" modelAttribute="trainee">
<table>
<tr>
<th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>
<tr>
<td><input type="text" value="${list.traineeId}" readonly/></td>
<td><input type="text" value="${list.traineeName}" readonly/></td>
<td><input type="text" value="${list.traineeLocation}" readonly/></td>
<td><input type="text" value="${list.traineeDomain}" readonly/></td>
<td><input type="submit" value="Delete" readonly/></td>
</tr>
</table>
</form>
</body>
</html>