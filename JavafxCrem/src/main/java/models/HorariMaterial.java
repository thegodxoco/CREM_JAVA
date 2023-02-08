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
public class HorariMaterial {
    private String material;
    private int quantitat;
    private String data;
    private String hora_inici;
    private String hora_final;

    

    public HorariMaterial(String material,int quant, String data, String hora_inici, String hora_final) {
        this.material = material;
        this.quantitat = quant;
        this.data = data;
        this.hora_inici = hora_inici;
        this.hora_final = hora_final;
        
        if(gurdarFitxer()==true){
            System.out.println("guardat correctament");
            guardarFitxer();
        }else
            System.out.println("horari incomatible");
        
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantitat() {
        return quantitat;
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
	FileReader f = new FileReader("horarios_mat/"+material+"_"+data+".csv"); 
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
        FileOutputStream fos= new FileOutputStream("horarios_mat/"+material+"_"+data+".csv");
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
           int quDia = Integer.parseInt(dia[i].substring(6));
           
           if(this.hora_inici.equals(dia[i].substring(0,5))){
               pr=true;
           }
           if(this.hora_final.equals(dia[i].substring(0,5))){
               return pr;
           }
           if(pr==true && quDia-quantitat <0 ){
            return false;
       }
       }
       return pr;
   }
   public String[] guardarArray(String[] dia){
       boolean pr2 = false;
       for(int e=0;e<dia.length;e++){
           String temporal = dia[e];
           if(pr2==true){
           dia[e]=dia[e].substring(0,5)+","+(Integer.parseInt(dia[e].substring(6))-quantitat); 
           }
           if(this.hora_inici.equals(temporal.substring(0,5))){
               pr2=true;
               dia[e]=dia[e].substring(0,5)+","+(Integer.parseInt(dia[e].substring(6))-quantitat); 
           }
           if(this.hora_final.equals(temporal.substring(0,5))){
               pr2=false;
                
               
           }
       }
       return dia;
   }
   
   public void guardarFitxer(){
        
        try{
        FileOutputStream fos= new FileOutputStream("reservas_material.csv",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        PrintWriter pw = new PrintWriter(osw);
        
        pw.print(this.material+";"+this.quantitat+";"+this.data+";"+this.hora_inici+";"+this.hora_final);
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

