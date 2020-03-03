<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste de formations</title>
</head>
<body>

<c:forEach items="${list}" var="formation">
<h2>${formation.id}</h2>
<h2>${formation.theme}</h2>
</c:forEach>


</body>
</html>
