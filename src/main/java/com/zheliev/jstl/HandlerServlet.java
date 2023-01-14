package com.zheliev.jstl;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "HendlerServlet", value = "/list")
public class HendlerServlet extends HttpServlet {
    private Orders orders = new Orders();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String brandStr = request.getParameter("brand");
        String priceStr = request.getParameter("price");
        List<Order> list;

        if(priceStr != null){
            int price = Integer.parseInt(priceStr);
            list = orders.get(price);
            request.setAttribute("price", true);
        }else if (brandStr != null){
            list = orders.get(brandStr);
            request.setAttribute("brand", brandStr);
        }else {
            list = orders.get(null);
        }

        request.setAttribute("ordersList", list);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/results.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
