/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;  
import javafx.geometry.Insets;
  
import javafx.scene.Group;   
import javafx.scene.control.Label;  
import javafx.scene.control.TableColumn;  
import javafx.scene.control.TableView;   
import javafx.scene.text.Font;  


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Valky
 */
public class ViewPpal {

    

    private GridPane pane;
    private Label gestioUsuari;
    private Label gestioReserves;
    private Button altaSoci;
    //private Button modificaSoci;
    private Button baixaSoci;
    private Button llistaSoci;
    private Button llistaNegra;
    private Button reservaEspai;
    //private Button modificaReserva;
    private Button llistaReserva;
    private Button reservaMaterial;
    private Button HorariMat;
    private Button altaMaterial;
    private Button llistaMaterial;
    private Button mostrarHorari;
    private TableView table = new TableView();  
    
    public ViewPpal() {

        this.pane = new GridPane();
        this.gestioUsuari= new Label("Gestió Usuaris");
        this.gestioReserves = new Label("Gestió Reserves");
        this.altaSoci = new Button("Nou Soci");
        //this.modificaSoci = new Button("Modifica Soci");
        this.baixaSoci = new Button("Elimina Soci");
        this.llistaSoci = new Button("Llista de Socis");
        this.llistaNegra = new Button("Llista Negra");
        this.reservaEspai = new Button("Nova Reserva");
        //this.modificaReserva = new Button("Modificar Reserva");
        this.llistaReserva = new Button("Llistat de Reserves");
        this.reservaMaterial = new Button("Reserva de Material");
        this.HorariMat = new Button("Horari Material");
        this.altaMaterial = new Button("Nou Material");
        this.llistaMaterial = new Button("Llista de Material");
        this.mostrarHorari = new Button("Mostra Horari");

        pane.setAlignment(Pos.CENTER);
        
        pane.add(gestioUsuari, 1, 0);
        pane.add(altaSoci, 1, 1);
        //pane.add(modificaSoci, 1, 2);
        pane.add(baixaSoci, 1, 3);
        pane.add(llistaSoci, 1, 4);
        pane.add(llistaNegra, 1, 5);
        pane.add(mostrarHorari, 1, 6);
        
        pane.add(gestioReserves, 0, 0);
        pane.add(reservaEspai, 0, 1);
        //pane.add(modificaReserva, 0, 2);
        pane.add(llistaReserva, 0, 3);
        pane.add(reservaMaterial, 0, 4);
        pane.add(HorariMat, 0, 5);
        pane.add(altaMaterial, 0, 6);
        pane.add(llistaMaterial, 0, 7);
        
        
        pane.setHgap(35);
        pane.setVgap(10);
        
        altaSoci.setMaxWidth(200);
       // modificaSoci.setMaxWidth(200);
        baixaSoci.setMaxWidth(200);
        llistaSoci.setMaxWidth(200);
        llistaNegra.setMaxWidth(200);
        reservaEspai.setMaxWidth(200);
        //modificaReserva.setMaxWidth(200);
        llistaReserva.setMaxWidth(200);
        reservaMaterial.setMaxWidth(200);
        HorariMat.setMaxWidth(200);
        altaMaterial.setMaxWidth(200);
        llistaMaterial.setMaxWidth(200);
        mostrarHorari.setMaxWidth(200);
        
    }

    /*private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(5, 5, 5, 5));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(altaSoci);
        hBox.getChildren().add(modificaSoci);
        hBox.getChildren().add(baixaSoci);
        hBox.getChildren().add(llistaSoci);
        hBox.getChildren().add(llistaNegra);
        return hBox;
    }

    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(5, 5, 5, 5));

        vBox.getChildren().add(reservaEspai);
        vBox.getChildren().add(modificaReserva);
        vBox.getChildren().add(reservaMaterial);
        vBox.getChildren().add(modificaReservaMaterial);
        vBox.getChildren().add(altaMaterial);
        vBox.getChildren().add(llistaMaterial);
        vBox.getChildren().add(mostrarHorari);

        return vBox;
    }*/

    public GridPane getPane() {
        return pane;
    }

    public void setPane(GridPane pane) {
        this.pane = pane;
    }

    public Button getAltaSoci() {
        return altaSoci;
    }

    public void setAltaSoci(Button altaSoci) {
        this.altaSoci = altaSoci;
    }

    

    public Button getBaixaSoci() {
        return baixaSoci;
    }

    public void setBaixaSoci(Button baixaSoci) {
        this.baixaSoci = baixaSoci;
    }

    public Button getLlistaSoci() {
        return llistaSoci;
    }

    public void setLlistaSoci(Button llistaSoci) {
        this.llistaSoci = llistaSoci;
    }

    public Button getLlistaNegra() {
        return llistaNegra;
    }

    public void setLlistaNegra(Button llistaNegra) {
        this.llistaNegra = llistaNegra;
    }

    public Button getReservaEspai() {
        return reservaEspai;
    }

    public void setReservaEspai(Button reservaEspai) {
        this.reservaEspai = reservaEspai;
    }

   

    public Button getLlistaReserva() {
        return llistaReserva;
    }

    public Button getMostrarHorari() {
        return mostrarHorari;
    }

    public TableView getTable() {
        return table;
    }
    
    public void setLlistaReserva(Button llistaReserva) {
        this.llistaReserva = llistaReserva;
    }

    public Button getReservaMaterial() {
        return reservaMaterial;
    }

    public void setReservaMaterial(Button reservaMaterial) {
        this.reservaMaterial = reservaMaterial;
    }

    public void setModificaReservaMaterial(Button modificaReservaMaterial) {
        this.HorariMat = modificaReservaMaterial;
    }

    public Button getModificaReservaMaterial() {
        return HorariMat;
    }

    public Button getAltaMaterial() {
        return altaMaterial;
    }

    public void setAltaMaterial(Button altaMaterial) {
        this.altaMaterial = altaMaterial;
    }

    public Button getLlistaMaterial() {
        return llistaMaterial;
    }

    public void setLlistaMaterial(Button llistaMaterial) {
        this.llistaMaterial = llistaMaterial;
    }

    public void setMostrarHorari(Button mostrarHorari) {
        this.mostrarHorari = mostrarHorari;
    }

    public void setTable(TableView table) {
        this.table = table;
    }
    
    public Label getGestioUsuari() {
        return gestioUsuari;
    }
    
    public void setGestioUsuari(Label gestioUsuari) {
        this.gestioUsuari = gestioUsuari;
    }

    public Label getGestioReserves() {
        return gestioReserves;
    }

    public void setGestioReserves(Label gestioReserves) {
        this.gestioReserves = gestioReserves;
    }

    public Button getHorariMat() {
        return HorariMat;
    }
    
    
}
