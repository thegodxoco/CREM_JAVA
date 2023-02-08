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
import java.util.Scanner;
import javafx.scene.control.TextField;

/**
 *
 * @author garci
 */
public class Reserva {

  Scanner sc = new Scanner(System.in);
  
    private String responsable;
    
    private String[] materials;
    private String pista;
    private String tipus;
    private String data;
    private String hora_inici;
    private String hora_final;

    

    public Reserva(String responsable, String pista, String data, String hora_inici, String hora_final) {
        this.responsable=responsable;
        this.data=data;
        this.hora_inici=hora_inici;
        this.hora_final=hora_final;
        
        this.pista = pista;
        this.tipus = tipus;
        Horari hora = new Horari(Integer.parseInt(this.pista),data,this.hora_inici,this.hora_final);
        guardarFitxer();
    }

    public String getID_responsable() {
        return responsable;
    }

    

    public String[] getMaterials() {
        return materials;
    }

    public String getPista() {
        return pista;
    }

    public String getTipus() {
        return tipus;
    }

    public void setData(String data) {
        
        this.data = data;
    }

    public void setHora_inici(String hora_inici) {
        this.hora_inici = hora_inici;
    }

    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }
    

    

    
    
    public void guardarFitxer(){
        
        try{
        FileOutputStream fos= new FileOutputStream("reservas.csv",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        PrintWriter pw = new PrintWriter(osw);
        
        pw.print(this.responsable+";"+this.data+";"+this.hora_inici+";"+this.hora_final+";"+this.pista);
        /*for(int i=0;i<this.Usuaris.length-1;i++){
             pw.print(";"+Usuaris[i].getDNI());
        }*/
           
        pw.print("\n");
        pw.close();
        
        }catch(Exception e){
            
         e.printStackTrace();
        }
    }
    
   
    
    
    

   
    
    
}
