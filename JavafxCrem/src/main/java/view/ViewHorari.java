/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author garci
 */
public class ViewHorari {
 private GridPane rootPane;
    private VBox vb;
    private Button exit;

    public ViewHorari() {
         rootPane = new GridPane();
        vb = new VBox();
        exit = new Button("salir");
        
        rootPane.getChildren().add(vb);
        vb.getChildren().add(exit);
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public VBox getVb() {
        return vb;
    }

    public void setRootPane(GridPane rootPane) {
        this.rootPane = rootPane;
    }

    public void setVb(VBox vb) {
        this.vb = vb;
    }

    public Button getExit() {
        return exit;
    }
    
    
    
    
}
