<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>${msg}</h1>
<form action="login" method="get">
<table border="2">
<tr>
<td>User Name :-</td>
<td><input name="q" type="text"/></td>
</tr>
<tr>
<td>User Name :-</td>
<td>
<input name="p" type="password"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Login"/>
</td>
</tr>
</table>
</form>
</body>
</html>