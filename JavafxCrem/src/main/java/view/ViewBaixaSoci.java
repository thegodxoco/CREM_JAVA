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
public class ViewBaixaSoci {

    private GridPane rootPane;
    private Label dniLabel;
    private TextField dniTextField;
    private HBox buttonPane;
    private Button EliminaButton;
    private Button ExitButton;

    public ViewBaixaSoci() {
        rootPane = new GridPane();
        rootPane.setAlignment(Pos.CENTER);
        rootPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        rootPane.setHgap(5.5);
        rootPane.setVgap(5.5);
        
        dniLabel = new Label("DNI:");

        dniTextField = new TextField();

        buttonPane = new HBox();
        buttonPane.setSpacing(5);
        EliminaButton = new Button("Elimina");
        ExitButton = new Button("Sortir");
        
        rootPane.add(dniLabel, 0, 0);
        rootPane.add(dniTextField, 1, 0);
        
        buttonPane.getChildren().addAll(EliminaButton, ExitButton);
        rootPane.add(buttonPane, 1, 3);
        buttonPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(buttonPane, HPos.RIGHT);
    }
    
    public GridPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(GridPane rootPane) {
        this.rootPane = rootPane;
    }

    public Label getDniLabel() {
        return dniLabel;
    }

    public void setDniLabel(Label dniLabel) {
        this.dniLabel = dniLabel;
    }

    public TextField getDniTextField() {
        return dniTextField;
    }

    public void setDniTextField(TextField dniTextField) {
        this.dniTextField = dniTextField;
    }

    public HBox getButtonPane() {
        return buttonPane;
    }

    public void setButtonPane(HBox buttonPane) {
        this.buttonPane = buttonPane;
    }

    public Button getEliminaButton() {
        return EliminaButton;
    }

    public void setEliminaButton(Button EliminaButton) {
        this.EliminaButton = EliminaButton;
    }

    public Button getExitButton() {
        return ExitButton;
    }

    public void setExitButton(Button ExitButton) {
        this.ExitButton = ExitButton;
    }
}
