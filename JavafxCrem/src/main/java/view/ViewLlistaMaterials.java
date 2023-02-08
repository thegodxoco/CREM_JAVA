/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author User
 */
public class ViewLlistaMaterials {
    private GridPane rootPane;
    private VBox vb;
    private Button exit;
    
    public ViewLlistaMaterials(){
        rootPane = new GridPane();
        vb = new VBox();
        exit = new Button("salir");
        
        rootPane.getChildren().add(vb);
        vb.getChildren().add(exit);
       
    }
    
    public VBox getVb() {
        return vb;
    }
    public GridPane getRootPane(){
        return rootPane;
    }

    public Button getExit() {
        return exit;
    }
    

   
}
