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
 * @author User
 */
public class Horari {
   private int pista;
    private String data;
    private String hora_inici;
    private String hora_final;

    public int getPista() {
        return pista;
    }

    public Horari(int pista, String data, String hora_inici, String hora_final) {
        this.pista = pista;
        this.data = data;
        this.hora_inici = hora_inici;
        this.hora_final = hora_final;
        
        if(gurdarFitxer()==true)
            System.out.println("guardat correctament");
        else
            System.out.println("horari incomatible");
        
    }
    
    

    public void setPista(int pista) {
        this.pista = pista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora_inici() {
        return hora_inici;
    }

    public void setHora_inici(String hora_inici) {
        this.hora_inici = hora_inici;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }
    
   public boolean gurdarFitxer(){
       String[] temp = new String[23];
       //guardar horari dia en array
       try{
        String cadena;
	FileReader f = new FileReader("horarios/"+String.valueOf(pista)+"_"+data+".csv"); 
	BufferedReader b = new BufferedReader(f); 
	if((cadena = b.readLine())!=null) { 
           temp = cadena.split(";");     
           }
	b.close(); 
        }catch(IOException e){
          e.printStackTrace();
        }
       
       
       
       
      if(comprovar(temp)==true){
          
          String[] temp_new=guardarArray(temp);
          
          
         try{
        FileOutputStream fos= new FileOutputStream("horarios/"+String.valueOf(pista)+"_"+data+".csv");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        PrintWriter pw = new PrintWriter(osw);
        
        for(int i=0;i<temp_new.length;i++){
            pw.print(temp_new[i]+";");
        }
        
        
        pw.close();
        
        }catch(Exception e){
            
         e.printStackTrace();
        }
          return true;
      }else{
          return false;
      }
          
          
       
       
       
        
       
    }

   public void mostrarHorari(int pista,String data){
       try{
        String cadena;
	FileReader f = new FileReader("horarios/"+String.valueOf(pista)+"_"+data+".csv"); 
	BufferedReader b = new BufferedReader(f); 
	while((cadena = b.readLine())!=null) { 
            System.out.println(cadena);
               
           }
	b.close();  
        
        }catch(IOException e){
          e.printStackTrace();
        }
    
       
   }
   public boolean comprovar(String[] dia){
       //comprovar si la reserva esta ocupada
       boolean pr = false;
       for(int i = 0;i<dia.length;i++){
           if(pr==true && dia[i].charAt(1)=='*'){
               return false;
           }
           if(this.hora_inici.equals(dia[i])){
               pr=true;
           }
           if(this.hora_final.equals(dia[i])){
               return pr;
           }
       }
       return pr;
   }
   public String[] guardarArray(String[] dia){
       boolean pr2 = false;
       for(int e=0;e<dia.length;e++){
           String temporal = dia[e];
           if(pr2==true){
           dia[e]= "*"+dia[e]; 
           }
           if(this.hora_inici.equals(temporal)){
               pr2=true;
               dia[e]="*"+dia[e]; 
           }
           if(this.hora_final.equals(temporal)){
               pr2=false;
                
               
           }
       }
       return dia;
   }
}

