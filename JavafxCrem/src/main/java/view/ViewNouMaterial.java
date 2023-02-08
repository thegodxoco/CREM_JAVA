/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Valky
 */
public class ViewNouMaterial {
    
    private GridPane rootPane;
    private Label nomMaterialLabel;
    private Label quantitatLabel;
    private TextField nomMaterialTextField;
    private TextField quantitatTextField;

    private HBox buttonPane;
    private Button guardarButton;
    private Button sortirButton;

    public ViewNouMaterial() {
        
        this.nomMaterialLabel = new Label("Nom Material: ");
        this.quantitatLabel = new Label("Quantitat: ");
        this.nomMaterialTextField = new TextField();
        this.quantitatTextField = new TextField();
        this.buttonPane = new HBox();
        this.guardarButton = new Button("Guardar");
        this.sortirButton = new Button("Sortir");
        
        this.rootPane = new GridPane();
        this.rootPane.setAlignment(Pos.CENTER);
        this.rootPane.setPadding(new Insets(5, 5, 5, 5));
        this.rootPane.setHgap(5.5);
        this.rootPane.setVgap(5.5);
        
        this.rootPane.add(nomMaterialLabel, 0, 0);
        this.rootPane.add(quantitatLabel, 0, 1);
        this.rootPane.add(nomMaterialTextField, 1 ,0);
        this.rootPane.add(quantitatTextField, 1 ,1);
        
        this.buttonPane.getChildren().addAll(guardarButton, sortirButton);
        this.rootPane.add(buttonPane, 1, 2);
        this.buttonPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(buttonPane, HPos.RIGHT);
    }
    
   
    
    public GridPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(GridPane rootPane) {
        this.rootPane = rootPane;
    }

    public Label getNomMaterialLabel() {
        return nomMaterialLabel;
    }

    public void setNomMaterialLabel(Label nomMaterialLabel) {
        this.nomMaterialLabel = nomMaterialLabel;
    }


    public HBox getButtonPane() {
        return buttonPane;
    }

    public void setButtonPane(HBox buttonPane) {
        this.buttonPane = buttonPane;
    }

    public Button getGuardarButton() {
        return guardarButton;
    }

    public void setGuardarButton(Button guardarButton) {
        this.guardarButton = guardarButton;
    }

    public Button getSortirButton() {
        return sortirButton;
    }

    public void setSortirButton(Button sortirButton) {
        this.sortirButton = sortirButton;
    }

    public Label getQuantitatLabel() {
        return quantitatLabel;
    }

    public TextField getNomMaterialTextField() {
        return nomMaterialTextField;
    }

    public TextField getQuantitatTextField() {
        return quantitatTextField;
    }
    
    
}
