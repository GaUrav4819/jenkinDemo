<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegisterPage</title>
</head>
<body>
<h3>New Employee Records</h3>
<form action="update">
<pre>
EmployeeId:<input type="hidden" name="eid" value="${e.eid}">
Name:<input type="text" name="name" value="${e.name}">
Salary:<input type="number" name="salary"  value="${e.salary}">
Department-Name:<input type="text" name="dname"  value="${e.dname}">
Designation:<input type="text" name="designation"  value="${e.designation}">
Year Of Experience:<input type="number" name="yrOfExperience"  value="${e.yrOfExperience}">
Address:<input type="text" name="addressofEmployee" value="${e.addressofEmployee}">
password:<input type="text" name="password" value="${e.password}">
<input type="submit" value="UPDATE">
</pre>
</form>
</body>
</html>