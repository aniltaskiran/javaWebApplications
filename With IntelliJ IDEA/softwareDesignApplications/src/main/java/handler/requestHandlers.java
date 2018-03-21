package handler;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.User;
import data.UserIO;

public class requestHandlers extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String message = "Some fields are empty please fill.";
        String url = "";
        String name = req.getParameter("firstName");
        String email = req.getParameter("email");
        User user = new User(name, email);

        req.setAttribute("user", user);

        if (name.equals("") || email.equals("")) {
            req.setAttribute("msg", message);
            url = "/index.jsp";
        } else {
            UserIO usrWrite = new UserIO();
            ServletConfig scg = getServletConfig();

            // String path = sc.getRealPath("/WEB-INF/userList.txt");
            String path = scg.getInitParameter("emailFileName");
            usrWrite.write(user, path);
            url = "/reply.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(req, resp);

    }
}
