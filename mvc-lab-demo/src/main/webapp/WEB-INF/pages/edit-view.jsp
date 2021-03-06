<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Book</title>
</head>
<body>
<h3>${msg }</h3>
<form method="post">
	Enter book id : <input type="text" value="0" name="id"/>
	<input type="submit" value="find"/>
</form>

<c:if test="${book !=null}">
<s:form action="edit-save" method="post" modelAttribute="book">
<table border=1 cellpadding="3" cellspacing="0">
<tr>
<td>Book Id</td> <td><s:input path="bookId" value="${book.bookId}"/><s:errors path="bookId" /></td>
</tr>
<td>Title</td> <td><s:input path="title" value="${book.title}"/></td>
</tr>
<td>Author</td> <td><s:input path="author" value="${book.author}"/></td>
</tr>
<tr>
<td colspan="3"> 
<input type="submit" value="save"/> 
</td>
</tr>
	
</table>
</s:form>
</c:if>
</body>
</html>