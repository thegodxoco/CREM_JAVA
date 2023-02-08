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
public class ControllerAltaMaterial {
    private ViewNouMaterial nouMaterial;

    public ControllerAltaMaterial(ViewNouMaterial nouMaterial) {
        this.nouMaterial = nouMaterial;
    }
    
    
    public void initView() {

    }
     public void initController(Stage stage){
         
       nouMaterial.getSortirButton().setOnAction(new EventHandler<ActionEvent>() {
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
       // gurdar material o modificar
         nouMaterial.getGuardarButton().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {
                 Material material = new Material(nouMaterial.getNomMaterialTextField().getText(),Integer.parseInt(nouMaterial.getQuantitatTextField().getText()));
                 
                
            }
        });
    
    }
}
