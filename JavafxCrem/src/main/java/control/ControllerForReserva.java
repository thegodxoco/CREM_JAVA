/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
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
public class ControllerForReserva {
    private ViewReserva reservas;

    public ControllerForReserva(ViewReserva Reserva) {
        this.reservas = Reserva;
    }
    
    
    public void initView() {

    }
     public void initController(Stage stage){
         
         //fer reserva 
        reservas.getReservarButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if(comprovarSoci(reservas.getDNITextField().getText())){
                   
                    ViewUsuReserva usu = new ViewUsuReserva();
                    ControllerUsuReserva c = new ControllerUsuReserva(usu);
                    c.initController(stage);
                    Scene scn_afegirUsu = new Scene(usu.getRootPane(),400,350);
                    stage.setTitle("Afegir usuaris");
                    stage.setScene(scn_afegirUsu);
                    stage.show();
                    Reserva reserva = new Reserva(reservas.getDNITextField().getText(),reservas.getIDpistaTextField().getText(),reservas.getDiaTextField().getText(), reservas.getHiniciTextField().getText(),reservas.getHfinalTextField().getText());
                    
                }
            }
        });
        
        reservas.getCancelarButton().setOnAction(new EventHandler<ActionEvent>() {
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
      private boolean comprovarSoci(String DNI) {

        try {
            String cadena;

            FileReader f = new FileReader("socis.csv");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                if (cadena.contains(DNI)) {
                    return true;
                }
            }
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
