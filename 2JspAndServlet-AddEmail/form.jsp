<!DOCTYPE html>
<head>
  <title> Email group </title>
  <meta charset="UTF-8">
</head>
<body>
  <h1> Join Our Email List </h1>
  <%@ page import="business.User" %>

  <%
    User user = (User) request.getAttribute("user");
    String message = (String) request.getAttribute("msg");

    if (user == null) {
      user = new User("","");
    }

    if (message == null) {
      message = "";
    }
  %>
  <p> <%= message %> </p>
  <form method="post" action="register">
    <label for ="idName"> Name: </label>
    <input type="text" id="idName" name="firstName" value= <%= user.getName() %>>
    <label for ="idEmail"> Email: </label>
    <input type="text" id="idEmail" name="email" value=<%= user.getEmail() %>>
    <input type="submit" value="submit">
  </form>
</body>
</html>
