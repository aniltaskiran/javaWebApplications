<%--
  Created by IntelliJ IDEA.
  User: kev
  Date: 21.03.2018
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<head>
    <title> Email List </title>
    <meta charset="UTF-8">
</head>
<body>
<h1> Welcome to Our Email List </h1>
<%@ page import="data.User" %>
<%@ page import="data.UserIO" %>

<%
    User user = (User) request.getAttribute("user");
%>

<p> Welcome <%= user.getName() %> tou our email list.
    Your email is <%= user.getEmail() %> </p>

</body>
</html>
