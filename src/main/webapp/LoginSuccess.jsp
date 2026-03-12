<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login Success</title>
</head>
<body>

<h2>
    Welcome <%= request.getAttribute("user") %> , Login Successful!
</h2>

<a href="login.html">Logout</a>

</body>
</html>