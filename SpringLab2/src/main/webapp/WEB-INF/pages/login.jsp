<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="login" method="post">
<table>
<tr>
<td>UserName</td>
<td><input type="text" name="username" ></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" ></td>
</tr>
<tr>
<td>
</td><td>
<input type="submit" value="Login"></td>
</tr>
</table>
</form>
<div>
<h3 style="color:red">${check}</h3>
</div>
</body>
</html>