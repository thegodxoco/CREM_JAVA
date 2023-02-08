/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author garci
 */
public class Soci extends Persona {

    private int ID;
    private int telefon;

    public Soci(String nom,String Cognoms,String DNI,int telefon) {
        super(nom,Cognoms,DNI);
        
        this.telefon=telefon;
        guardarFitxer();
    }

 
    public int getID() {
        return ID;
    }

    public int getTelefon() {
        return telefon;
    }
    
    
    public void guardarFitxer(){
        try{
        FileOutputStream fos= new FileOutputStream("socis.csv",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        PrintWriter pw = new PrintWriter(osw);
        
        pw.print(getDNI()+";"+getNom()+";"+getCognoms()+";"+this.telefon);
        pw.print("\n");
        pw.close();
        
        }catch(Exception e){
            
         e.printStackTrace();
        }
    }
    public void mostrarSocis(){
       try{
        String cadena;
	FileReader f = new FileReader("socis.csv"); 
	BufferedReader b = new BufferedReader(f); 
	while((cadena = b.readLine())!=null) { 
            System.out.println(cadena);
               
           }
	b.close();  
        
        }catch(IOException e){
          e.printStackTrace();
        }
    }
}