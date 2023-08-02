package com.example.md4_ss1_bt1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Discountservlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double percent = Double.parseDouble(req.getParameter("percent")) ;

        double discount = price * percent*0.01;
        double amount = price - discount;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h2> Product: "+ description + "</h2>");
        writer.println("<h2> List Price: " + price + "</h2>");
        writer.println("<h2> Discount Percent: "+ percent + "</h2>");
        writer.println("<h2> Discount Price: " + discount + "</h2>");
        writer.println("<h2> Discount Amount: " + amount + "</h2>");
        writer.println("<html>");
    }
}