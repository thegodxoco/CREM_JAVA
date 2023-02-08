/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Valky
 */
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ViewCancelReservaMaterial {

    private GridPane rootPane;
    private Label nomMaterialLabel;
    private Label nomPersonaLabel;
    private Label DNILabel;
    private Label horaLabel;
    private Label dataLabel;
    private TextField nomTextField;
    private TextField dataTextField;
    private TextField horaTextField;
    private TextField nomPersonaTextField;
    private TextField DNITextField;
    private HBox buttonPane;
    private Button guardarButton;
    private Button carregarButton;
    
    public ViewCancelReservaMaterial() {
        
        this.nomMaterialLabel = new Label("Material:");
        this.nomPersonaLabel = new Label("Nom:");
        this.DNILabel = new Label("DNI:");
        this.horaLabel = new Label("Hora:");
        this.dataLabel = new Label("Data:");
        this.nomTextField = new TextField();
        this.dataTextField = new TextField();
        this.horaTextField = new TextField();
        this.nomPersonaTextField = new TextField();
        this.DNITextField = new TextField();
        this.buttonPane = new HBox();
        this.guardarButton = new Button("Cancelar Reserva");
        this.carregarButton = new Button("Sortir");

        this.rootPane = new GridPane();
        this.rootPane.setAlignment(Pos.CENTER);
        this.rootPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        this.rootPane.setHgap(5.5);
        this.rootPane.setVgap(5.5);

        this.rootPane.add(nomMaterialLabel, 0, 0);
        this.rootPane.add(horaLabel, 0, 1);
        this.rootPane.add(dataLabel, 0, 2);
        this.rootPane.add(nomPersonaLabel, 0, 3);
        this.rootPane.add(DNILabel, 0, 5);
        this.rootPane.add(nomTextField, 1, 0);
        this.rootPane.add(dataTextField, 1, 1);
        this.rootPane.add(horaTextField, 1, 2);
        this.rootPane.add(nomPersonaTextField, 1, 3);
        this.rootPane.add(DNITextField, 1, 5);

        this.buttonPane.getChildren().addAll(guardarButton, carregarButton);
        this.rootPane.add(buttonPane, 1, 6);
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

    public Label getNomPersonaLabel() {
        return nomPersonaLabel;
    }

    public void setNomPersonaLabel(Label nomPersonaLabel) {
        this.nomPersonaLabel = nomPersonaLabel;
    }

    public Label getDNILabel() {
        return DNILabel;
    }

    public void setDNILabel(Label DNILabel) {
        this.DNILabel = DNILabel;
    }

    public Label getHoraLabel() {
        return horaLabel;
    }

    public void setHoraLabel(Label horaLabel) {
        this.horaLabel = horaLabel;
    }

    public Label getDataLabel() {
        return dataLabel;
    }

    public void setDataLabel(Label dataLabel) {
        this.dataLabel = dataLabel;
    }

    public TextField getNomTextField() {
        return nomTextField;
    }

    public void setNomTextField(TextField nomTextField) {
        this.nomTextField = nomTextField;
    }

    public TextField getDataTextField() {
        return dataTextField;
    }

    public void setDataTextField(TextField dataTextField) {
        this.dataTextField = dataTextField;
    }

    public TextField getHoraTextField() {
        return horaTextField;
    }

    public void setHoraTextField(TextField horaTextField) {
        this.horaTextField = horaTextField;
    }

    public TextField getNomPersonaTextField() {
        return nomPersonaTextField;
    }

    public void setNomPersonaTextField(TextField nomPersonaTextField) {
        this.nomPersonaTextField = nomPersonaTextField;
    }

    public TextField getDNITextField() {
        return DNITextField;
    }

    public void setDNITextField(TextField DNITextField) {
        this.DNITextField = DNITextField;
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

    public Button getCarregarButton() {
        return carregarButton;
    }

    public void setCarregarButton(Button carregarButton) {
        this.carregarButton = carregarButton;
    }

}
