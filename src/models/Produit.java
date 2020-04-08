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
public class Produit {
    //il va falloir creer les instances de categories lors de la requete pour les passer au constructeur
    private int codePro;
    private String nomPo;
    private double prixVente;
    private double prixAchat;
    private String description;
    private Fournisseur fournisseur;
    private SimpleDateFormat dateInsertion;
    private int actif;
    private Categorie categorie;

    public int getCodePro() {
        return codePro;
    }

    public void setCodePro(int codePro) {
        this.codePro = codePro;
    }

    public String getNomPo() {
        return nomPo;
    }

    public void setNomPo(String nomPo) {
        this.nomPo = nomPo;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public SimpleDateFormat getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(SimpleDateFormat dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public int getActif() {
        return actif;
    }

    public void setActif(int actif) {
        this.actif = actif;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
}
