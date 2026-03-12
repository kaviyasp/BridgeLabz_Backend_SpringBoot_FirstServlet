package com.firstservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Name validation
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";

        if(!user.matches(nameRegex)){
            out.println("<h3 style='color:red'>Invalid Name! Must start with capital and have at least 3 characters.</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request,response);
            return;
        }

        // Password validation
        if(pwd.length() < 8){
            out.println("<h3 style='color:red'>Password must be at least 8 characters.</h3>");
            return;
        }

        boolean hasUpper = pwd.matches(".*[A-Z].*");
        boolean hasDigit = pwd.matches(".*\\d.*");

        int specialCount = pwd.replaceAll("[A-Za-z0-9]", "").length();

        if(!hasUpper){
            out.println("<h3 style='color:red'>Password must contain at least one uppercase letter.</h3>");
            return;
        }

        if(!hasDigit){
            out.println("<h3 style='color:red'>Password must contain at least one number.</h3>");
            return;
        }

        if(specialCount != 1){
            out.println("<h3 style='color:red'>Password must contain exactly one special character.</h3>");
            return;
        }

        // If all validations pass
        request.setAttribute("user", user);

        RequestDispatcher rd =
                request.getRequestDispatcher("LoginSuccess.jsp");

        rd.forward(request, response);
    }
}