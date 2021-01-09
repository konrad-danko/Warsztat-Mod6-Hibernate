<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>All Books</title>
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
    <div class="clearfix">
        <h2 class="float-left ml-3">Lista książek</h2>
        <a href="/formBooks/addBook" class="float-right btn btn-success mr-3">Dodaj nową książkę</a>
    </div>
    <br>
    <table class="table table-bordered table-hover">
        <thead class="bg-primary text-white">
        <tr>
            <th>Id</th>
            <th>ISBN</th>
            <th>Tytuł</th>
            <th>Autor</th>
            <th>Wydawca</th>
            <th>Gatunek</th>
            <th class="text-center">Edytuj</th>
            <th class="text-center">Usuń</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allBooks}" var="book">
            <tr>
                <td class="align-middle">${book.id}</td>
                <td class="align-middle">${book.isbn}</td>
                <td class="align-middle">${book.title}</td>
                <td class="align-middle">${book.author}</td>
                <td class="align-middle">${book.publisher}</td>
                <td class="align-middle">${book.type}</td>
                <td class="text-center"><a href="/formBooks/editBook/${book.id}" class="btn btn-warning btn-sm">Edytuj</a></td>
                <td class="text-center"><a href="/formBooks/deleteBook/${book.id}" class="btn btn-danger btn-sm">Usuń</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
