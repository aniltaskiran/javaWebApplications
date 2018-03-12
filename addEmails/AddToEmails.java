package com.anil;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.UserIO;
import business.User;

public class AddToEmails extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
  throws ServletException, IOException {
    String name = req.getParameter("firstName");
    String email = req.getParameter("email");

    User usr = new User(name, email);
    UserIO usrWrite = new UserIO();
    String path = getServletContext().getRealPath("/") + "userList.txt";

    usrWrite.write(usr, path);
    response(resp, name, email);
  }

      private void response(HttpServletResponse resp, String name, String email)
      throws IOException {
          PrintWriter out = resp.getWriter();
          out.println("<html>");
          out.println("<body>");
          out.println("<t1> Welcome " + name + " to our ");
          out.print("email list. Your email is" + email + "</t1>");
          out.println("</body>");
          out.println("</html>");
      }
}
