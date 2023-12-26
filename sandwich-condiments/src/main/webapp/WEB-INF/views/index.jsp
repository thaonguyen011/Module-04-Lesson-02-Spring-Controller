<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h1>Sandwich Condiments
</h1>
<br/>
<form action="/save" method="post">
    <label>
        <input type="checkbox" name="condiment" value="Lettuce">
    </label>Lettuce
    <label>
        <input type="checkbox" name="condiment" value="Tomato">
    </label>Tomato
    <label>
        <input type="checkbox" name="condiment" value="Mustard">
    </label>Mustard
    <label>
        <input type="checkbox" name="condiment" value="Sprouts">
    </label>Sprouts
    <hr>
    <input type="submit" value="Save">
</form>
</body>
</html>