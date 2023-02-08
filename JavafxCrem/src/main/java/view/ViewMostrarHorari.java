/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author garci
 */
public class ViewMostrarHorari {
    private GridPane rootPane;
    private Label idpista;
    private Label dia;
    private TextField idpistaText;
    private TextField diaTextField;
    private Button mostrar;
    private Button tancar;

    public ViewMostrarHorari() {
        this.rootPane = new GridPane();
        this.idpista = new Label("ID Pista: ");
        this.dia = new Label("Dia: ");
        this.idpistaText = new TextField();
        this.diaTextField = new TextField();
        this.mostrar = new Button("Mostra");
        this.tancar = new Button("Tancar");
        
        rootPane.setAlignment(Pos.CENTER);
        rootPane.add(idpista, 0, 0);
        rootPane.add(dia, 0, 1);
        rootPane.add(idpistaText, 1, 0);
        rootPane.add(diaTextField, 1, 1);
        rootPane.add(mostrar, 1, 2);
        rootPane.add(tancar, 2, 2);
        
        rootPane.setHgap(15);
        rootPane.setVgap(10);
        
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public Label getIdpista() {
        return idpista;
    }

    public Label getDia() {
        return dia;
    }

    public TextField getIdpistaText() {
        return idpistaText;
    }

    public TextField getDiaTextField() {
        return diaTextField;
    }

    public Button getMostrar() {
        return mostrar;
    }

    public Button getTancar() {
        return tancar;
    }
    
    

    public void setRootPane(GridPane rootPane) {
        this.rootPane = rootPane;
    }

    public void setIdpista(Label idpista) {
        this.idpista = idpista;
    }

    public void setDia(Label dia) {
        this.dia = dia;
    }

    public void setIdpistaText(TextField idpistaText) {
        this.idpistaText = idpistaText;
    }

    public void setDiaTextField(TextField diaTextField) {
        this.diaTextField = diaTextField;
    }

    public void setMostrar(Button mostrar) {
        this.mostrar = mostrar;
    }

    public void setTancar(Button tancar) {
        this.tancar = tancar;
    }
    
    
    
    
    
    
    
    
}
