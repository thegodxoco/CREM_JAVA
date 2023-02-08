/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.*;
import models.*;

/**
 *
 * @author garci
 */
public class ControllerBaixaSoci {
    private ViewBaixaSoci baixaSocis;

    public ControllerBaixaSoci( ViewBaixaSoci baixaSocis) {
        this.baixaSocis = baixaSocis;
    }
    
    
     public void initView() {

    }
     public void initController(Stage stage){
         
         //eliminar Soci
        baixaSocis.getEliminaButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if( borrarSoci(baixaSocis.getDniTextField().getText())){
                   
               }else{
                   //mostrar que no s'ha fet
               }
                
            }
        });
        
         baixaSocis.getExitButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                ViewPpal ppal = new ViewPpal();
                ControllerPpal c = new ControllerPpal(ppal);
                c.initController(stage);
                Scene scn_principal = new Scene(ppal.getPane(), 400, 350);
                
                    stage.setTitle("Menu principal");
                    stage.setScene(scn_principal);
                    stage.show();
                   
                
                
            }
        });
    
    }
     
     public boolean borrarSoci(String DNI){
        boolean q = false;
       try {
           
           //guardar tots els socis menys el seleccionat
            String cadena;
            String socis = "";
            FileReader f = new FileReader("socis.csv");
            BufferedReader b = new BufferedReader(f);
            int i = 0;
            while((cadena = b.readLine()) != null) {
                if(cadena.contains(DNI)){
                    q=true;
                }else{
                if(i==0){
                    socis = cadena;
                    
                }else
               socis.concat(","+cadena);
             i++;
            }
                
            }
            b.close();
            if(q==true && !"".equals(socis)){
            //eliminar file
            File sociscsv = new File("socis.csv");
            sociscsv.delete();
            
            //escriure els usuaris guardats
            String[] socisar = new String[10];
                  socisar = socis.split(",");
            
            for(int e=0;e<socisar.length;e++){
                String[] fi = new String[4];
                      fi  = socisar[e].split(";");
                Soci soci = new Soci(fi[1],fi[2],fi[0],Integer.parseInt(fi[3]));
            }
            }else if(q== true && "".equals(socis)){
                File sociscsv = new File("socis.csv");
                sociscsv.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       return q;
    }
}
