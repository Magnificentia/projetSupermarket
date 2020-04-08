/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author _Nprime496_
 */
public class Gestionnaire {
    private int idGest;
    private String nomGest;
    private byte typeGest;
    private String login;
    private String pwd;
    private boolean actif;
    

    public int getidGest() {
        return idGest;
    }

    public void setidGest(int idGest) {
        this.idGest = idGest;
    }

    public String getNomGest() {
        return nomGest;
    }

    public void setNomGest(String nomGest) {
        this.nomGest = nomGest;
    }

    public byte getTypeGest() {
        return typeGest;
    }

    public void setTypeGest(byte typeGest) {
        this.typeGest = typeGest;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
    
    
    
}
