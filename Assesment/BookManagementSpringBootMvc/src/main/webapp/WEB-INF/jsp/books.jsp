<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>


<link rel="stylesheet" type="text/css"

href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<c:url value="/css/main.css" var="jstlCss" />

<link href="${jstlCss}" rel="stylesheet" />


</head>

<body>

<c:url var="addLink" value="/hi"></c:url>

<div><a href="${addLink}">Add</a></div>

<div class="container">

<header>

<h1>Book Management</h1>

</header>

<div class="starter-template">

<h1>Books List</h1>

<table

class="table table-striped table-hover table-condensed table-bordered">

<tr>

<th>Id</th>

<th>Name</th>

<th>Price</th>

<th> Update Book </th>
<th> Delete Book </th>

</tr>

<c:forEach var="book" items="${books}">

<tr>

<td>${book.id}</td>

<td>${book.name}</td>
<td>${book.price}</td>
<td>
<a href="updatePage"?=${book.id}> Update</a>
<form action = "updatePage" method = "post" style = "display: inline;">

<input type= "hidden" name = "id" value = "${book.id}">
<!--<input type = submit name = "updateButton" value = "Update"> -->
</form>

 </td>
 <td>
<form action = "deleteData" method = "post" style = "display: inline;">

<input type= "hidden" name = "id" value = "${book.id}">
<input type = submit name = "deleteButton" value = "Delete">
</form>

 </td>
</tr>

</c:forEach>

</table>

</div>


</div>


<script type="text/javascript"

src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>


</html>