package com.anil;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import data.UserIO;
import business.User;

public class AddToEmails extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
  throws ServletException, IOException {
    String name = req.getParameter("firstName");
    String email = req.getParameter("email");
    User user = new User(name, email);

    UserIO usrWrite = new UserIO();
    req.setAttribute("user", user);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/reply.jsp");
        rd.forward(req, resp);

    String path = getServletContext().getRealPath("/WEB-INF/userList.txt");

    usrWrite.write(user, path);

  }
}
