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
    String name = request.getParameter("firstName");
    String email = request.getParameter("email");
    User usr = new User(name, email);
    UserIO usrWrite = new UserIO();
    String path = getServletContext().getRealPath("/") + "userList.txt";

    usrWrite.write(usr, path);
  %>

<p> Welcome <%= usr.getName() %> tou our email list. Your email is <%= email %> file saved to <%= path %> </p>

</body>
</html>
