<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile Form</title>
</head>
<body>
<table>
<fo:form action="adddata" method="post" modelAttribute="my">

<tr>
<td>Mobile Id</td>
<td><fo:input path="mobId"/>
</tr>

<tr>
<td>Mobile Name</td>
<td><fo:input path="mobName"/>
</tr>

<tr>
<td>Mobile Price</td>
<td><fo:input path="mobPrice"/>
</tr>

<tr>
<td>Mobile Category</td>
<td><fo:select path="mobCategory" items="${cato}"></fo:select>
</td></tr>

<tr>
<td>Online</td>
<td><fo:radiobutton path="mobOnline" value="YES"/>Yes
<fo:radiobutton path="mobOnline" value="NO"/>No
</td></tr>
<tr>
<td>
<input type="submit" value="Add Mobile"/>
</td></tr>
</fo:form></table>
</body>
</html>