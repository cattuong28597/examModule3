<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show List Product</title>
    <link rel="stylesheet" href="/assets/bootstrap-5.1.3/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>Product</h1>
    <h2>
        <a href="/products?action=create">Add New Book</a>
    </h2>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">ProductName</th>
            <th scope="col">Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Color</th>
            <th scope="col">Category</th>
            <th scope="col" colspan="3" style="text-align: center">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items='${requestScope["productList"]}' var="product">
            <tr>
                <th scope="row">${product.getId()}</th>
                <td>${product.getProductName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getQuantity()}</td>
                <td>${product.getColor()}</td>
                <td>${product.getCategory()}</td>
                <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
                <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

