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
 * @author User
 */
public class ViewAltaSocis {

    private GridPane rootPane;
    private Label nomLabel;
    private Label primerCognomLabel;
    private Label DNILabel;
    private Label telefonLabel;
    private TextField nomTextField;
    private TextField primerCognomTextField;
    private TextField DNITextField;
    private TextField telefonTextField;
    private HBox buttonPane;
    private Button guardarButton;
    private Button carregarButton;

    public ViewAltaSocis() {
        rootPane = new GridPane();
        rootPane.setAlignment(Pos.CENTER);
        rootPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        rootPane.setHgap(5.5);
        rootPane.setVgap(5.5);

        nomLabel = new Label("Nom:");
        primerCognomLabel = new Label("Cognoms:");
        DNILabel = new Label("DNI:");
        telefonLabel = new Label("Telefon");
        nomTextField = new TextField();
        primerCognomTextField = new TextField();
        DNITextField = new TextField();
        telefonTextField= new TextField();
        buttonPane = new HBox();
        buttonPane.setSpacing(5);
        guardarButton = new Button("Guardar");
        carregarButton = new Button("Cancelar");

        rootPane.add(nomLabel, 0, 0);
        rootPane.add(primerCognomLabel, 0, 1);
        rootPane.add(DNILabel, 0, 2);
        rootPane.add(telefonLabel, 0, 3);
        rootPane.add(nomTextField, 1, 0);
        rootPane.add(primerCognomTextField, 1, 1);
        rootPane.add(DNITextField, 1, 2);
        rootPane.add(telefonTextField, 1, 3);

        buttonPane.getChildren().addAll(guardarButton, carregarButton);
        rootPane.add(buttonPane, 1, 4);
        buttonPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(buttonPane, HPos.RIGHT);
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public Label getNomLabel() {
        return nomLabel;
    }

    public Label getPrimerCognomLabel() {
        return primerCognomLabel;
    }

    public TextField getNomTextField() {
        return nomTextField;
    }

    public TextField getPrimerCognomTextField() {
        return primerCognomTextField;
    }

    public HBox getButtonPane() {
        return buttonPane;
    }

    public Button getGuardarButton() {
        return guardarButton;
    }

    public Button getCarregarButton() {
        return carregarButton;
    }

    public Label getDNILabel() {
        return DNILabel;
    }

    public Label getTelefonLabel() {
        return telefonLabel;
    }

    public TextField getDNITextField() {
        return DNITextField;
    }

    public TextField getTelefonTextField() {
        return telefonTextField;
    }
    
    
}

