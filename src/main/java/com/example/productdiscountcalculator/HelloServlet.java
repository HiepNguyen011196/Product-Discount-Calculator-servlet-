package com.example.productdiscountcalculator;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountCalculator", value = "/calculator")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        float price = Float.parseFloat(request.getParameter("ListPrice"));
        float discount = Float.parseFloat(request.getParameter("DiscountPercent"));

        float discountAmount = (float) (price * discount * 0.01);
        float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Discount Amount: " + discountAmount + "</h2>");
        writer.println("<h2>Discount Price: " + discountPrice + "</h2");
        writer.println("</html>");
    }

    public void destroy() {
    }
}