<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
    <link rel="stylesheet" href="/assets/bootstrap-5.1.3/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>Edit Product</h1>
    <h2>
        <a href="/products">Back to Product List</a>
    </h2>

    <form method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" value="${requestScope["productEdit"].getProductName()}">
        </div>
        <div class="mb-3">
            <label class="form-label">Price</label>
            <input type="number" class="form-control" value="${requestScope["productEdit"].getPrice()}">
        </div>
        <div class="mb-3">
            <label class="form-label">Quantity</label>
            <input type="number" class="form-control" value="${requestScope["productEdit"].getQuantity()}">
        </div>
        <div class="mb-3">
            <label class="form-label">Color</label>
            <input type="text" class="form-control" value="${requestScope["productEdit"].getColor()}">
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <input type="text" class="form-control" value="${requestScope["productEdit"].getDescription()}">
        </div>
        <div class="mb-3">
            <label class="form-label">Category</label>
            <select class="form-control form-select" name="category">
                <option value="Phone">Phone</option>
                <option value="Television">Television</option>
                <option value="Computer">Computer</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Edit</button>
    </form>
</div>
</body>
</html>
