<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form submitted</title>

</head>
<body>
<h1>${Header}</h1>
  <h3>${Desc }</h3>

<h2>Welcome ${user.name} </h2>
<h2>Email address ${user.email} </h2>
<h2>Your Password ${user.password} </h2>
</body>
</html>