package business;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.util.ArrayList;

public class AddProduct extends HttpServlet
{
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws java.io.IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        //.... request.getSession(true);
        HttpSession session = request.getSession();
        System.out.println("session ID: " + session.getId());

        ArrayList<String> products = (ArrayList)
                session.getAttribute("items");
        String prodName = request.getParameter("prodName");

        if(products == null){
            products = new ArrayList<String>();
            session.setAttribute("items", products);
        }

        String url = null;

        if(prodName.toLowerCase().equals("end"))
            url = "/checkout.jsp";
        else {
            products.add(prodName);
            url = "/cookieIndex.jsp";
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}









