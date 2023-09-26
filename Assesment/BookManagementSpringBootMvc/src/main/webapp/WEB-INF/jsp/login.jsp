<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <h1>Login</h1>
    <form:form action="login" method="post" modelAttribute="user">
        <form:hidden path="id" />
        
        <label for="username">Enter Username:</label>
        <form:input path="username" />
        <br>
        
        <label for="password">Enter Password:</label>
        <form:input path="password" />
        <br>
        
        <form:button>Login</form:button>
    </form:form>
    
    <form action="registerUser" method="get" style="display: inline;">
        <input type="submit" name="registerButton" value="Register">
    </form>
</body>
</html>
