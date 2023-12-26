<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator
</h1>
<br/>
<form action="/calculate" method="post">
    <label>
        <input type="text" name="firstOperand" placeholder="Enter a number">
    </label><br>
    <label>
        <input type="text" name="secOperand" placeholder="Enter a number">
    </label>
    <input type="submit" name="submitButton" value="Addition">
    <input type="submit" name="submitButton" value="Subtraction">
    <input type="submit" name="submitButton" value="Multiple">
    <input type="submit" name="submitButton" value="Division">
</form>

<p>Result of the operation is: ${result}</p>
</body>
</html>