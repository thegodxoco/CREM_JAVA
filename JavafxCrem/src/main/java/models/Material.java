
package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class Material {
     private String nom;
    private int quantitat;
    
    private String[] cadenas=new String[10];

    public Material(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
        
       
        this.cadenas=  comprovarMaterial(this.nom);
        guardarFitxer(this.nom,this.quantitat);
        
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }
    public void mostrarMaterial(){
       try{
        String cadena;
	FileReader f = new FileReader("material.csv"); 
	BufferedReader b = new BufferedReader(f); 
	while((cadena = b.readLine())!=null) { 
            System.out.println(cadena);
               
           }
	b.close();  
        
        }catch(IOException e){
          e.printStackTrace();
        }
    }
    public void ModificaMaterial(String n, int q){
        this.nom=n;
        this.quantitat=q;
    }
    
    public void guardarFitxer(String nom , int quantitat){
        File file = new File("material.csv");
        file.delete();
    try{
        FileOutputStream fos= new FileOutputStream("material.csv",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        PrintWriter pw = new PrintWriter(osw);
        for(int i=0;i<cadenas.length;i++){
        pw.print(cadenas[i]);
        pw.print("\n");
        }
        pw.close();
        
        }catch(Exception e){
            
         e.printStackTrace();
        }
    }
    public String[] comprovarMaterial(String nom){
        
        try{
        boolean comp = false;
        String cad = "";
        String cadena;
	FileReader f = new FileReader("material.csv"); 
	BufferedReader b = new BufferedReader(f); 
        int i = 0;
	while((cadena = b.readLine())!=null) { 
           if(cadena.contains(nom)){
              comp=true;
              String[] canvi= cadena.split(";");
              canvi[1]=quantitat+"";
              
              cadena=canvi[0]+";"+canvi[1];
              
           }
           if(i==0){
               cad=cadena;
           }else{
               cad=cad.concat(","+cadena);
           }
           i++;
           }
        if(comp == false){
          cad=cad.concat(","+nom+";"+quantitat);
            
        }
	b.close();
        return cad.split(",");
        
        
        }catch(IOException e){
          e.printStackTrace();
        }
        
        return null;
    }
}
