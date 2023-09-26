<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>


<title>Register User</title>

</head>

<body>


<form:form action="saveUser" cssClass="form-horizontal"

method="post" modelAttribute="user">


<!-- need to associate this data with customer id -->

<form:hidden path="id" />


<label for="name">Enter User Name</label>

<form:input path="username" /><br>
<label for="name">Enter Password</label>

<form:input path="password" />
<br>
<form:button>Register</form:button>


</form:form>


</body>

</html>