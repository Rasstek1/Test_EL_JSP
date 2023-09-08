package com.martin.test_el.messervlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.martin.test_el.mesmodels.ProduitDataContext;

import java.io.IOException;

@WebServlet(name = "listProduits", value = "/ListProduits")
public class ListProduits extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listeproduits",  ProduitDataContext.getListeProduits());
        String destination ="listeproduits.jsp";
        request.getRequestDispatcher(destination).forward(request, response);

    }

}
