package com.example.demo7;

import java.io.*;

import com.example.demo7.model.User;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @EJB
    User user = new User();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        user.setName("Xongi");
        user.setLastname("Baloyi");
        System.out.println(user.getLastname());
        System.out.println(user.getName());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" +"LastName: "+user.getLastname() + "</h1>");
        out.println("<h1>" +"Name: " + user.getName() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}