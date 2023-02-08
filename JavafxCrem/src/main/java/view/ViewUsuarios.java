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
public class ViewUsuarios {
     private GridPane rootPane;
    private Label nomLabel;
    private Label DNILabel;
    private TextField nomTextField;
    private TextField DNITextField;
    private Button guardar;

    public ViewUsuarios() {
        this.rootPane = new GridPane();
        this.nomLabel = new Label();
        this.DNILabel = new Label();
        this.nomTextField = new TextField();
        this.DNITextField = new TextField();
        this.guardar= new Button();
        
        rootPane.add(nomLabel, 0, 0);
        rootPane.add(DNILabel, 0, 1);
        rootPane.add(nomTextField, 1, 0);
        rootPane.add(DNITextField, 1, 1);
        rootPane.add(guardar,2,1);
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public Label getNomLabel() {
        return nomLabel;
    }

    public Label getDNILabel() {
        return DNILabel;
    }

    public TextField getNomTextField() {
        return nomTextField;
    }

    public TextField getDNITextField() {
        return DNITextField;
    }

   
    
    
}
