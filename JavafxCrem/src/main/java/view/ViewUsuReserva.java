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
public class ViewUsuReserva {
    private GridPane rootPane;
    private Label nomLabel;
    private Label primerCognomLabel;
    private Label DNILabel;
    
    private TextField nomTextField;
    private TextField primerCognomTextField;
    private TextField DNITextField;
    private Button guardar;
    private Button exit;

    public ViewUsuReserva() {
        this.rootPane = new GridPane();
        this.nomLabel = new Label("nom: ");
        this.primerCognomLabel = new Label("Cognom: ");
        this.DNILabel = new Label("DNI: ");
        this.nomTextField = new TextField();
        this.primerCognomTextField = new TextField();
        this.DNITextField = new TextField();
        this.guardar = new Button("guardar");
        this.exit = new Button("sortir");
        
        rootPane.add(nomLabel, 0, 0);
        rootPane.add(primerCognomLabel, 0, 1);
        rootPane.add(DNILabel, 0, 2);
        rootPane.add(nomTextField, 1, 0);
        rootPane.add(primerCognomTextField, 1, 1);
        rootPane.add(DNITextField, 1, 2);
         rootPane.add(guardar,1,3)  ;
         rootPane.add(exit,2,3)  ;
    
        
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

    public Label getDNILabel() {
        return DNILabel;
    }

    public TextField getNomTextField() {
        return nomTextField;
    }

    public TextField getPrimerCognomTextField() {
        return primerCognomTextField;
    }

    public TextField getDNITextField() {
        return DNITextField;
    }

    public Button getGuardar() {
        return guardar;
    }

    public Button getExit() {
        return exit;
    }

    public void setRootPane(GridPane rootPane) {
        this.rootPane = rootPane;
    }

    public void setNomLabel(Label nomLabel) {
        this.nomLabel = nomLabel;
    }

    public void setPrimerCognomLabel(Label primerCognomLabel) {
        this.primerCognomLabel = primerCognomLabel;
    }

    public void setDNILabel(Label DNILabel) {
        this.DNILabel = DNILabel;
    }

    public void setNomTextField(TextField nomTextField) {
        this.nomTextField = nomTextField;
    }

    public void setPrimerCognomTextField(TextField primerCognomTextField) {
        this.primerCognomTextField = primerCognomTextField;
    }

    public void setDNITextField(TextField DNITextField) {
        this.DNITextField = DNITextField;
    }

    public void setGuardar(Button guardar) {
        this.guardar = guardar;
    }

    public void setExit(Button exit) {
        this.exit = exit;
    }
    
    
    
    
}
