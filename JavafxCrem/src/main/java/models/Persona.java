/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author garci
 */
public abstract class Persona {
   private String nom ;
    private String cognoms ;
    private String DNI;
    

    public Persona(String nom, String cognoms, String DNI) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.DNI = DNI;
        
    }
    
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    
    
    
}
