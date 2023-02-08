package control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import view.*;
import crem.*;
import models.*;

/**
 *
 * @author garci
 */
public class Controller {

    //views
    private ViewLogin login;
    private ViewPpal Ppal;
    private ViewAltaSocis altaSocis;
    private ViewLlistaSocis llistaSocis;
    private ViewMostrarHorari mostrarHoraris;
    private ViewHorari horaris;
    private ViewReserva reservas;
    private ViewLlistaReserves llistaReserves;
    private ViewBaixaSoci baixaSocis;
    private ViewNouMaterial nouMaterials;
    private ViewMaterials materials;
    //models
    private Soci soci;

    
    //stages
    private Stage principal = new Stage();
    private Stage altaSoci = new Stage();
    private Stage llistaSoci = new Stage();
    private Stage mostrarHorari = new Stage();
    private Stage horari = new Stage();
    private Stage reserva = new Stage();
    private Stage llistaReserva = new Stage();
    private Stage baixaSoci = new Stage();
    private Stage nouMaterial = new Stage();
    private Stage material = new Stage();

    public Controller(ViewLogin login, ViewPpal Ppal, ViewAltaSocis altaSocis, ViewLlistaSocis llistaSocis, ViewMostrarHorari mostrarHoraris, ViewHorari horari, ViewReserva reservas, ViewLlistaReserves llistaReserves, ViewBaixaSoci baixaSocis, ViewNouMaterial nouMaterials, ViewMaterials materials) {

        this.login = login;
        this.Ppal = Ppal;
        this.altaSocis = altaSocis;
        this.llistaSocis = llistaSocis;
        this.mostrarHoraris = mostrarHoraris;
        this.horaris = horari;
        this.reservas = reservas;
        this.llistaReserves = llistaReserves;
        this.baixaSocis = baixaSocis;
        this.nouMaterials = nouMaterials;
        this.materials = materials;
        initView();
    }

    public void initView() {

    }

    

    public void initController(Stage stage) {
        //accedir menu principal
        login.getAccedir().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (comprovarAdmin()) {
                    //canviar stage principal
                    
                    try{
                      ViewPpal  Ppal = new ViewPpal();
                      ControllerPpal c = new ControllerPpal(Ppal);
                      c.initController(stage);
                    Scene scn_principal = new Scene(Ppal.getPane(), 400, 350);
                    stage.setTitle("Menu principal");
                    stage.setScene(scn_principal);
                    stage.show();
                    
                    }catch(Exception e){
                        
                    }
                } else {
                    login.getEstat().getChildren().clear();
                    login.getEstat().getChildren().add(new Label("Usuari o contrasenya incorrecte!"));
                }
            }

        });
        
        
        
       
        
       
        
        
        
        
        
        
        

        

        
        

        
         
        
         
        
         
         
        
        
    }
    public boolean comprovarAdmin() {
        try {
            String cadena;
            FileReader f = new FileReader("admins.csv");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                String[] dades = cadena.split(";");
                if (dades[0].equals(login.getUsuText().getText()) && dades[1].equals(login.getUsuPswText().getText())) {
                    return true;
                }
                b.close();
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }

    
   

   
    
    
    
}
