package com.martin.test_el.mesmodels;

public class Produit {
    private int numero;
    private String description;
    private double prix;
    private char taxe;



    private String fournisseur;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public char getTaxe() {
        return taxe;
    }

    public void setTaxe(char taxe) {
        this.taxe = taxe;
    }
    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }
    public Produit(){}
    public Produit(int numero, String description, double prix, char taxe, String fournisseur) {
        this.numero = numero;
        this.description = description;
        this.prix = prix;
        this.taxe=taxe;
        this.fournisseur=fournisseur;
    }

}
