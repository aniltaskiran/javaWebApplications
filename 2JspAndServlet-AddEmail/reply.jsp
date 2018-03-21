<!DOCTYPE html>
<head>
  <title> Email List </title>
  <meta charset="UTF-8">
</head>
<body>
  <h1> Welcome to Our Email List </h1>
  <%@ page import="business.User" %>
  <%@ page import="data.UserIO" %>

  <%
    User user = (User) request.getAttribute("user");
  %>

<p> Welcome <%= user.getName() %> tou our email list.
Your email is <%= user.getEmail() %> </p>

</body>
</html>
