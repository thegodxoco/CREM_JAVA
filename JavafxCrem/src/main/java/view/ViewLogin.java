/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author garci
 */
public class ViewLogin {
    
    GridPane pane; 
    private Label usu;
    private TextField usuText;
    private Label usuPsw;
    private PasswordField usuPswText;
    private Button accedir;
    private VBox estat;

    public ViewLogin() {
       this.pane = new GridPane();
       this.usu = new Label("Usuari: ");
       this.usuText= new TextField();
       this.usuPsw = new Label("Contrasenya: ");
       this.usuPswText= new PasswordField();
       this.accedir = new Button("Accedir");
       this.estat= new VBox();
       
       pane.setAlignment(Pos.CENTER);
       pane.add(usu, 0, 0); 
       pane.add(usuPsw, 0, 1);
       pane.add(usuText, 1, 0);
       pane.add(usuPswText, 1, 1);
       pane.add(accedir, 1, 2); 
       pane.add(estat, 0, 3); 
       
       pane.setHgap(15);
       pane.setVgap(10);
    }

    public void setPane(GridPane pane) {
        this.pane = pane;
    }

    public void setUsu(Label usu) {
        this.usu = usu;
    }

    public void setUsuText(TextField usuText) {
        this.usuText = usuText;
    }

    public void setUsuPsw(Label usuPsw) {
        this.usuPsw = usuPsw;
    }

    public void setUsuPswText(PasswordField usuPswText) {
        this.usuPswText = usuPswText;
    }

    public void setAccedir(Button accedir) {
        this.accedir = accedir;
    }

    public void setEstat(VBox estat) {
        this.estat = estat;
    }
    

    public GridPane getPane() {
        return pane;
    }

    public Label getUsu() {
        return usu;
    }

    public TextField getUsuText() {
        return usuText;
    }

    public Label getUsuPsw() {
        return usuPsw;
    }

    public PasswordField getUsuPswText() {
        return usuPswText;
    }

    public Button getAccedir() {
        return accedir;
    }

    public VBox getEstat() {
        return estat;
    }
}
