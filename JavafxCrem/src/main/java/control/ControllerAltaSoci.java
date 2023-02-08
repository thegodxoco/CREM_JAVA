/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import view.*;
import models.*;
import crem.*;
import javafx.stage.Stage;

/**
 *
 * @author garci
 */
public class ControllerAltaSoci {
    private ViewAltaSocis altaSoci;

    public ControllerAltaSoci(ViewAltaSocis altaSoci) {
        this.altaSoci=altaSoci;
    }
    
    
    public void initView() {

    }
     public void initController(Stage stage){
         
         //gurdar soci
        altaSoci.getGuardarButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Soci soci = new Soci(altaSoci.getNomTextField().getText(), altaSoci.getPrimerCognomTextField().getText(), altaSoci.getDNITextField().getText(), Integer.parseInt(altaSoci.getTelefonTextField().getText()));
                
            }
        });
        
        //sortir alta soci
         altaSoci.getCarregarButton().setOnAction(new EventHandler<ActionEvent>() {
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
