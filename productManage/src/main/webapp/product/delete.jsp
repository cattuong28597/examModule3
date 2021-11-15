
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
    <link rel="stylesheet" href="/assets/bootstrap-5.1.3/css/bootstrap.min.css">
</head>
<body>
<h1>Delete</h1>
<p>
    <a href="/products">Back to Product List</a>
</p>
<form method="post">
    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" value="${requestScope["productDelete"].getProductName()}">
    </div>
    <div class="mb-3">
        <label class="form-label">Price</label>
        <input type="number" class="form-control" value="${requestScope["productDelete"].getPrice()}">
    </div>
    <div class="mb-3">
        <label class="form-label">Quantity</label>
        <input type="text" class="form-control" value="${requestScope["productDelete"].getQuantity()}">
    </div>
    <div class="mb-3">
        <label class="form-label">Color</label>
        <input type="text" class="form-control" value="${requestScope["productDelete"].getColor()}">
    </div>
    <div class="mb-3">
        <label class="form-label">Description</label>
        <input type="text" class="form-control" value="${requestScope["productDelete"].getDescription()}">
    </div>
    <div class="mb-3">
        <label class="form-label">Category</label>
        <input type="text" class="form-control" value="${requestScope["productDelete"].getCategory()}">
    </div>
    <button type="submit" class="btn btn-primary">Delete</button>
</form>
</body>
</html>
