/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author User
 */
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ViewMaterials {

    private GridPane rootPane;
    private Label nomMaterialLabel;
    private Label quantitat;
    private Label DNILabel;
    private Label horaLabel;
    private Label horaFinalLabel;
    private Label dataLabel;
    private TextField nomTextField;
    private TextField quantitatTextField;
    private TextField dataTextField;
    private TextField horaTextField;
    private TextField horaFinalTextField;
    private TextField DNITextField;
    private HBox buttonPane;
    private Button guardarButton;
    private Button carregarButton;

    public ViewMaterials() {
        rootPane = new GridPane();
        rootPane.setAlignment(Pos.CENTER);
        rootPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        rootPane.setHgap(5.5);
        rootPane.setVgap(5.5);

        nomMaterialLabel = new Label("Material:");
       quantitat = new Label("Quantitat: ");
        DNILabel = new Label("DNI: ");
        horaLabel = new Label("Hora inicial: ");
        dataLabel = new Label("Data: ");
        horaFinalLabel = new Label("Hora final: ");
        nomTextField = new TextField();
        quantitatTextField = new TextField();
        dataTextField = new TextField();
        horaTextField = new TextField();
        horaFinalTextField = new TextField();
        
        DNITextField = new TextField();
        buttonPane = new HBox();
        buttonPane.setSpacing(5);
        guardarButton = new Button("Guardar");
        carregarButton = new Button("Sortir");

        rootPane.add(nomMaterialLabel, 0, 0);
        rootPane.add(quantitat, 0,1);
        rootPane.add(dataLabel, 0, 2);
        rootPane.add(horaLabel, 0, 3);
        rootPane.add(horaFinalLabel, 0, 4);
        rootPane.add(DNILabel, 0, 5);
        rootPane.add(nomTextField, 1, 0);
         rootPane.add(quantitatTextField, 1, 1);
        rootPane.add(dataTextField, 1, 2);
        rootPane.add(horaTextField, 1, 3);
        rootPane.add(horaFinalTextField, 1, 4);
        rootPane.add(DNITextField, 1, 5);

        buttonPane.getChildren().addAll(guardarButton, carregarButton);
        rootPane.add(buttonPane, 1, 6);
        buttonPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(buttonPane, HPos.RIGHT);
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public Label getNomMaterialLabel() {
        return nomMaterialLabel;
    }

    public Label getQuantitat() {
        return quantitat;
    }

    public Label getDNILabel() {
        return DNILabel;
    }

    public Label getHoraLabel() {
        return horaLabel;
    }

    public Label getHoraFinalLabel() {
        return horaFinalLabel;
    }

    public Label getDataLabel() {
        return dataLabel;
    }

    public TextField getNomTextField() {
        return nomTextField;
    }

    public TextField getQuantitatTextField() {
        return quantitatTextField;
    }

    public TextField getDataTextField() {
        return dataTextField;
    }

    public TextField getHoraTextField() {
        return horaTextField;
    }

    public TextField getHoraFinalTextField() {
        return horaFinalTextField;
    }

    public TextField getDNITextField() {
        return DNITextField;
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

    
    
    
    
    
}

