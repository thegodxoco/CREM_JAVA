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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import view.*;
/**
 *
 * @author garci
 */
public class ControllerForHorari {
    private ViewMostrarHorari mostrarHoraris;
    private ViewHorari horaris;

    public ControllerForHorari(ViewMostrarHorari mostrarHoraris) {
        this.mostrarHoraris = mostrarHoraris;
    }
    public void initView() {

    }
     public void initController(Stage stage){
         
       //mostrar horari
        mostrarHoraris.getMostrar().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                File file = new File("horarios/" + mostrarHoraris.getIdpistaText().getText() + "_" + mostrarHoraris.getDiaTextField().getText() + ".csv");
                if (file.exists()) {
                    horaris= new ViewHorari();
                    mostrarHorari(file);
                    ControllerHorari c = new ControllerHorari(horaris);
                    c.initController(stage);
                    Scene scn_Horari = new Scene(horaris.getRootPane(), 400, 350);
                    
                    stage.setTitle("Horari");
                    stage.setScene(scn_Horari);
                    stage.show();
                } else {

                }
            }
        });
        
        mostrarHoraris.getTancar().setOnAction(new EventHandler<ActionEvent>() {
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
     
      public boolean mostrarHorari(File file) {
        try {
            String cadena;
            FileReader f = new FileReader(file);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                System.out.println(cadena);
                String[] hora = cadena.split(";");
                for (int i = 0; i < hora.length; i++) {
                    horaris.getVb().getChildren().add(new Label(hora[i]));
                }

            }
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
    
}
