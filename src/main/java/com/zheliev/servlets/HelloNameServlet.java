package com.zheliev.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloNameServlet", value = "/HelloNameServlet")
public class HelloNameServlet extends HttpServlet {

    static final String TEMPLATE =
            "<html>" +
                    "<head><title>DemoTomcatServlet1</title></head>" +
                    "<body><h1>%s</h1></body>" +
                    "</html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String msg = "Hello, ";
        String result = msg + name;


        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println(String.format(TEMPLATE, result));
    }
}
