<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Form Book</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <br>

<h2>${headerMessage}</h2>

    <form:form modelAttribute="book" method="post">
        <form:hidden path="id"/>
        <div class="form-group">
            <label for="isbn">Nr ISBN:</label>
            <form:input path="isbn" id="isbn" class="form-control" disabled="${disabledParam}"/>
        </div>
        <div class="form-group">
            <label for="title">Tytuł:</label>
            <form:input path="title" id="title" class="form-control" disabled="${disabledParam}"/>
        </div>
        <div class="form-group">
            <label for="author">Autor:</label>
            <form:input path="author" id="author" class="form-control" disabled="${disabledParam}"/>
        </div>
        <div class="form-group">
            <label for="publisher">Wydawca:</label>
            <form:input path="publisher" id="publisher" class="form-control" disabled="${disabledParam}"/>
        </div>
        <div class="form-group">
            <label for="type">Gatunek:</label>
            <form:input path="type" id="type" class="form-control" disabled="${disabledParam}"/>
        </div>
        <input type="submit" value="Zatwierdź" class="btn ${buttonClass} ml-3">
        <a href="/formBooks/showAllBooks" class="btn btn-secondary ml-3">Anuluj i wróć do listy książek</a>
    </form:form>

</div>
</body>
</html>
