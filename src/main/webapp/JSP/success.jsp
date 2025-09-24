<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SuccessPage</title>
</head>
<body>
<table border="1">
     <tr>
      <th>eid</th>
      <th>name</th>
      <th>salary</th>
      <th>dname</th>
      <th>designation</th>
      <th>yrOfExperience</th>
      <th>addressofEmployee</th>
      <th>password</th>
      <th>Action</th>
     </tr>
      
      <c:forEach items="${data}" var="s">
      <tr>
      <td>${s.eid}</td>
      <td>${s.name}</td>
      <td>${s.salary}</td>
      <td>${s.dname}</td>
      <td>${s.designation}</td>
      <td>${s.yrOfExperience}</td>
      <td>${s.addressofEmployee}</td>
      <td>${s.password}</td>
      <td><a href="delete?eid=${s.eid}">DELETE</a>||<a href="edit?eid=${s.eid}">EDIT</a></td>
      </tr>
      </c:forEach>
      </table>
      <a href="paging?pageNo=0">1</a>||<a href="paging?pageNo=1">2</a>||<a href="paging?pageNo=2">3</a>||<a href="paging?pageNo=3">4</a>
</body>
</html>