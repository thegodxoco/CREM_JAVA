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


/**
 *
 * @author garci
 */
public class ControllerLlistaSocis {
    private ViewLlistaSocis llistaSocis;

    public ControllerLlistaSocis(ViewLlistaSocis llistaSocis) {
        this.llistaSocis = llistaSocis;
    }
    
    
     public void initView() {

    }
     public void initController(Stage stage){
         
       llistaSocis.getExit().setOnAction(new EventHandler<ActionEvent>() {
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
