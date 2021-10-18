<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date Template</title>
<link rel="stylesheet" href="css/style.css">
<script src="js/main.jas"></script>
</head>
<body>
<script>dateAlert()</script>
<p class="blue"><fmt:formatDate pattern="EEEE, 'the' dd 'of' MMMM, YYYY" value="${dateTime}"/></p>
</body>
</html>