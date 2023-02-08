/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
public class ControllerForReservaMat {
    private ViewMaterials materials;

    public ControllerForReservaMat(ViewMaterials materials) {
        this.materials=  materials;
    }
    
    
      public void initView() {

    }
     public void initController(Stage stage){
         
       //guardar reserva material
         materials.getGuardarButton().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {
                 ReservaMaterial resMat = new ReservaMaterial(materials.getNomTextField().getText(),Integer.parseInt(materials.getQuantitatTextField().getText()),materials.getDataTextField().getText(),materials.getHoraTextField().getText(),materials.getHoraFinalTextField().getText());

               
            }
         });
         
         materials.getCarregarButton().setOnAction(new EventHandler<ActionEvent>() {
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
}
