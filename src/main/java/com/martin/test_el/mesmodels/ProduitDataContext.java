package com.martin.test_el.mesmodels;

import java.util.ArrayList;
import java.util.List;

public class ProduitDataContext {
    private  static List<Produit> listeproduits= new ArrayList(){
        {
            add(new Produit(1,"Stylo",10.99,'A',"Toto"));
            add(new Produit(2,"Crayon",2.50,'A',"Tintin"));
            add(new Produit(3,"Cahier",4.99,'S',"Toto"));
            add(new Produit(4,"Efface",5.00,'A',"Toto"));

        }
    };
    public static java.util.List<Produit> getListeProduits(){
        return ProduitDataContext.listeproduits;
    }


    public  static Produit find(int numero){
        Produit p;
        p=ProduitDataContext.listeproduits.stream().filter((a)->a.getNumero()==numero).findFirst().get();
        return p;
    }
}
