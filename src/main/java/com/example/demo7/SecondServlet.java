package com.example.demo7;

import com.example.demo7.model.User;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class SecondServlet extends HttpServlet {

    @EJB(mappedName = "obj")
    User newUser = new User();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // Hello
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" +"LastName: "+newUser.getLastname() + "</h1>");
        out.println("<h1>" +"Name: " + newUser.getName() + "</h1>");
        out.println("</body></html>");
    }
}
