<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.martin.test_el.mesmodels.Produit" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*" %>


<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <title>ListeProduits</title>
</head>


<body>
<h1><c:out value="La liste des produits"/></h1>
<!--defininition des liens-->


<table class="table">
    <tr>
        <th>Numéro</th>
        <th>Description</th>
        <th>Prix</th>
        <th>Commande</th>
    </tr>
    <c:forEach var="p2" items="${listeproduits}">/*la variable var p2 va recevoir les items de la liste listeproduits*/
        <c:url var="urldetails" value="/DetailsServlet">
            <c:param name="numero" value="${p2.numero}"/>
        </c:url>

        <tr>
            <td><c:out value="${p2.numero}"/></td>
            <td><c:out value="${p2.description}"/></td>
            <td><c:out value="${p2.prix}"/></td>
            <td>
                <c:if test="${p2.prix > 10}">
                    <c:out value="Plus cher"/>
                </c:if>
                <c:if test="${p2.prix <= 10}">
                    <c:out value="Moins cher"/>
                </c:if>

        </tr>


    <tr>
        <td>${sessionScope.p2.numero} </td>
        <td>${p2.description}</td>
        <td>${p2.prix}</td>
        <td>
            <a href="${urldetails}">Voir détails</a>
        </td>
    </tr>


</table>
</body>
</html>

