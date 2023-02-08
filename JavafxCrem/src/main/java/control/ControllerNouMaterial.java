/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import view.*;
import models.*;

/**
 *
 * @author garci
 */
public class ControllerNouMaterial {
    private ViewNouMaterial nouMaterials;

    public ControllerNouMaterial(ViewNouMaterial NouMaterial) {
        this.nouMaterials = NouMaterial;
    }
    
    
     public void initView() {

    }
     public void initController(Stage stage){
         
          // gurdar material o modificar
         nouMaterials.getGuardarButton().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {
                 Material material = new Material(nouMaterials.getNomMaterialTextField().getText(),Integer.parseInt(nouMaterials.getQuantitatTextField().getText()));
                 
                
            }
        });
       
    
    }
}
