package com.zheliev.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "AnketaServlet", value = "/AnketaServlet")
public class AnketaServlet extends HttpServlet {
    final static int question_1_yes =0;
    final static int question_1_no =1;
    final static int question_2_yes =2;
    final static int question_2_no =3;

    static final String TEMPLATE = "<html>" +
                                    "<head><title>Prog.Academy</title></head>" +
                                    "<body><h1>%s</h1>" +
                                    "Click this link to move <a href=\"/anketa.jsp\">Back to ANKETA</a>" +
                                    "</body>" +
                                    "</html>";

    final int[] results = new int[4];


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("anketa.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String q1 = request.getParameter("question1");
        final String q2 = request.getParameter("question2");

        final int id1 = "yes".equals(q1) ? question_1_yes : question_1_no;
        final int id2 = "yes".equals(q2) ? question_2_yes : question_2_no;

        results[id1]++;
        results[id2]++;

        String res = "<p>Question 1: yes = " + results[question_1_yes] + ", no = " + results[question_1_no] + "</p>";
        res += "<p>Question 2: yes = " + results[question_2_yes] + ", no = " + results[question_2_no] + "</p>";

        response.getWriter().println(String.format(TEMPLATE, res));
    }
}
