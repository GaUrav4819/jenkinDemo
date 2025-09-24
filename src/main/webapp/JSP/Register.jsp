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
<form action="save">
<pre>
EmployeeId:<input type="number" name="eid">
Name:<input type="text" name="name">
Salary:<input type="number" name="salary">
Department-Name:<input type="text" name="dname">
Designation:<input type="text" name="designation">
Year Of Experience:<input type="number" name="yrOfExperience">
Address:<input type="text" name="addressofEmployee">
password:<input type="text" name="password">
<input type="submit" value="SAVE">
</pre>
</form>
</body>
</html>