/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.SimpleDateFormat;

/**
 *
 * @author _Nprime496_
 */
public class GestionStock {
    private int idStock;
    private double qte;
    private SimpleDateFormat dateStock;
    private byte operation;
    private Gestionnaire gestionnaire;
    private Produit produit;

    public GestionStock(int idStock, double qte, SimpleDateFormat dateStock, byte operation, Gestionnaire gestionnaire, Produit produit) {
        this.idStock = idStock;
        this.qte = qte;
        this.dateStock = dateStock;
        this.operation = operation;
        this.gestionnaire = gestionnaire;
        this.produit = produit;
    }
    
    

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public double getQte() {
        return qte;
    }

    public void setQte(double qte) {
        this.qte = qte;
    }

    public SimpleDateFormat getDateStock() {
        return dateStock;
    }

    public void setDateStock(SimpleDateFormat dateStock) {
        this.dateStock = dateStock;
    }

    public byte getOperation() {
        return operation;
    }

    public void setOperation(byte operation) {
        this.operation = operation;
    }

    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
}
