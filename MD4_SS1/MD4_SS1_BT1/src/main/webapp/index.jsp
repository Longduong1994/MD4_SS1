<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product-Discount-Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="Discountservlet">
    <label>Product Description: </label></br>
    <input type="text" name="description" placeholder="description" /></br>
    <label>List Price: </label></br>
    <input type="text" name="price" placeholder="price" value="0"/></br>
    <label>Discount Percent: </label></br>
    <input type="text" name="percent" placeholder="percent" value="0"/></br>
    <input type="submit" id="submit" value="calculate" />
</form>
</body>
</html>