<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>


<title> Update Book</title>

</head>

<body>


<form:form action="updateBook" cssClass="form-horizontal"

method="post" modelAttribute="book">


<!-- need to associate this data with customer id -->

<!--<form:hidden path="id" />
<label for = "id"> ID: </label>
<input type = "text" name = "id" value = "${book.id}" readonly><br> -->

<form:hidden path="id" />

<label for="name">Enter Updated Book Name</label>
<input type = "text" name = "name" value = "${book.name}">

<br>

<label for="price">Enter Update Book Price</label>
<input type = "text" name = "price" value = "${book.price}"><br>

<br>
<form:button>Update</form:button>


</form:form>


</body>

</html>