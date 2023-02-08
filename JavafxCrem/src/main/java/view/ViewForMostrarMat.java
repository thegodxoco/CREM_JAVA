/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author garci
 */
public class ViewForMostrarMat {
    private GridPane rootPane;
    private Label nomLabel;
    private Label diaLabel;
    private TextField nomTextField;
    private TextField diaTextField;
    private Button mostrar;
    private Button exit;

    public ViewForMostrarMat() {
        this.rootPane = new GridPane();
        this.nomLabel = new Label("material: ");
        this.diaLabel = new Label("dia: ");
        this.nomTextField = new TextField();
        this.diaTextField = new TextField();
        this.mostrar= new Button("mostrar");
        this.exit = new Button("salir");
        
        rootPane.add(nomLabel, 0, 0);
        rootPane.add(diaLabel, 0, 1);
        rootPane.add(mostrar, 0, 2);
        
        rootPane.add(nomTextField, 1, 0);
        rootPane.add(diaTextField, 1, 1);
        rootPane.add(exit, 1, 2);
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public Label getNomLabel() {
        return nomLabel;
    }

    public Label getDiaLabel() {
        return diaLabel;
    }

    public TextField getNomTextField() {
        return nomTextField;
    }

    public TextField getDiaTextField() {
        return diaTextField;
    }

    public Button getMostrar() {
        return mostrar;
    }

    public Button getExit() {
        return exit;
    }
    
    
}
