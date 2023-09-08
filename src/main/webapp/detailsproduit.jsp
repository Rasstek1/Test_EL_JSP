<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.martin.test_el.mesmodels.Produit" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

<h2>Les détails du produit</h2>

<table>
    <tr>
        <td style="text-align: right">Le numéro :</td>
        <td> ${produit.numero}</td>
    </tr>
    <tr>
        <td style="text-align: right">La description :</td>
        <td>${produit.description}</td>
    </tr>
    <tr>
        <td style="text-align: right">Le prix :</td>
        <td>${produit.prix}</td>
    </tr>
    <tr>
        <td style="text-align: right">Taxe : </td>
        <td>${produit.taxe}</td>
    </tr>
    <tr>
        <td>Le fournisseur :</td>
        <td>${produit.fournisseur}</td>
    </tr>
</table>
</body>
</html>
