package com.example.md4_ss1;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "/home", value = "/time-world")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Hello World</h1>");
        writer.println("</html>");
        writer.println("<html>");
        Date today = new Date();
        writer.println("<h1>" + today +"</h1>");
        writer.println("</html>");
    }
}