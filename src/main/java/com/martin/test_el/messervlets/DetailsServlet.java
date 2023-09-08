package com.martin.test_el.messervlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.martin.test_el.mesmodels.Produit;
import com.martin.test_el.mesmodels.ProduitDataContext;

import java.io.IOException;

@WebServlet(name = "detailsServlet", value = "/DetailsServlet")
public class DetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("numero")!=null){
            int num=Integer.parseInt(request.getParameter("numero"));
            // rechercher le produit de la liste
            Produit produit= ProduitDataContext.find(num);
            request.setAttribute("produit",  produit);
            String destination ="detailsproduit.jsp";
            request.getRequestDispatcher(destination).forward(request, response);

        }

    }
}
