<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>


<title>Add Book</title>

</head>

<body>


<form:form action="saveBook" cssClass="form-horizontal"

method="post" modelAttribute="book">


<!-- need to associate this data with customer id -->

<form:hidden path="id" />


<label for="name">Enter Book Name</label>

<form:input path="name" />

<br>

<label for="price">Enter Book Price</label>

<form:input path="price" />

<br>
<form:button>Save</form:button>


</form:form>


</body>

</html>