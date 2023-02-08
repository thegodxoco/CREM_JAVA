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
public class ControllerForMostrarMat {
    private ViewForMostrarMat ForMostrarMat;
    private ViewHorariMat horariMat;

    public ControllerForMostrarMat(ViewForMostrarMat ForMostrarMat) {
        this.ForMostrarMat=ForMostrarMat;
    }
    
    public void initView() {

    }
     public void initController(Stage stage){
          ForMostrarMat.getMostrar().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                File file = new File("horarios_mat/" + ForMostrarMat.getNomTextField().getText() + "_" + ForMostrarMat.getDiaTextField().getText() + ".csv");
                if (file.exists()) {
                    horariMat= new ViewHorariMat();
                    mostrarHorari(file);
                    ControllerHorariMat c = new ControllerHorariMat(horariMat);
                    c.initController(stage);
                    Scene scn_Horari = new Scene(horariMat.getRootPane(), 400, 350);
                    
                    stage.setTitle("Horari");
                    stage.setScene(scn_Horari);
                    stage.show();
                } else {

                }
            }
        });
          
           ForMostrarMat.getExit().setOnAction(new EventHandler<ActionEvent>() {
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
                    horariMat.getVb().getChildren().add(new Label(hora[i]));
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
