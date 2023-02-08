/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import crem.Globals;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import view.*;

/**
 *
 * @author garci
 */
public class ControllerPpal {
    private ViewPpal Ppal;
    private ViewLlistaSocis llistaSocis;
    private ViewLlistaReserves llistaReservas;
    private ViewLlistaMaterials llistaMaterial;

    public ControllerPpal(ViewPpal ppal) {
        this.Ppal=ppal;
    }
    
    
    public void initView() {

    }
     public void initController(Stage stage){
         
         //mostrar formulari alta soci
        Ppal.getAltaSoci().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               ViewAltaSocis altaSocis=new ViewAltaSocis();
                ControllerAltaSoci c= new ControllerAltaSoci(altaSocis);
                c.initController(stage);
                Scene scn_altaSoci = new Scene(altaSocis.getRootPane(), 400, 350);
                stage.setTitle("Nou Soci");
                stage.setScene(scn_altaSoci);
                stage.show();
            }
        });
    
         //mostrar baixa soci 
        Ppal.getBaixaSoci().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewBaixaSoci baixaSocis = new ViewBaixaSoci();
                ControllerBaixaSoci c = new ControllerBaixaSoci(baixaSocis);
                c.initController(stage);
                Scene scn_baixaSoci = new Scene(baixaSocis.getRootPane(), 400, 350);
                stage.setTitle("Nou Soci");
                stage.setScene(scn_baixaSoci);
                stage.show();
            }
        });
        
        //mostrar Socis
        Ppal.getLlistaSoci().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               llistaSocis  = new ViewLlistaSocis();
                ControllerLlistaSocis c = new ControllerLlistaSocis(llistaSocis);
                c.initController(stage);
                Scene scn_llistaSoci = new Scene(llistaSocis.getRootPane(), 400, 350);
                stage.setTitle("llista Soci");
                stage.setScene(scn_llistaSoci);
                mostrarSocis();
                stage.show();
            }
        });

        
        
        //mostrar formulari seleccionar horari
        Ppal.getMostrarHorari().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewMostrarHorari mostrarHoraris = new ViewMostrarHorari();
                ControllerForHorari c = new ControllerForHorari(mostrarHoraris);
                c.initController(stage);
                Scene scn_mostrarHorari = new Scene(mostrarHoraris.getRootPane(), 400, 350);
                stage.setTitle("Mostrar Horari");
                stage.setScene(scn_mostrarHorari);
                stage.show();
            }
        });
        
        //mostrar formulari reserva
        Ppal.getReservaEspai().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewReserva reservas = new ViewReserva();
                ControllerForReserva c = new ControllerForReserva(reservas);
                c.initController(stage);
                Scene scn_reserva = new Scene(reservas.getRootPane(), 400, 350);
                stage.setTitle("Formulari reserva");
                stage.setScene(scn_reserva);
                stage.show();
            }
        });
        
        //mostrar reservas
        Ppal.getLlistaReserva().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {

                 llistaReservas=new ViewLlistaReserves();
                 ControllerLlistaReservas c = new ControllerLlistaReservas(llistaReservas);
                 c.initController(stage);
                Scene scn_llistaReserves = new Scene(llistaReservas.getRootPane(), 400, 350);
                stage.setTitle("Llista de reserves");
                stage.setScene(scn_llistaReserves);
                mostrarReservas();
                stage.show();
            }
        });
        
        ///
        Ppal.getLlistaMaterial().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {

                 llistaMaterial=new ViewLlistaMaterials();
                 ControllerLlistaMaterial c = new ControllerLlistaMaterial(llistaMaterial);
                 c.initController(stage);
                Scene scn_llistaMaterial = new Scene(llistaMaterial.getRootPane(), 400, 350);
                stage.setTitle("Llista de reserves");
                stage.setScene(scn_llistaMaterial);
                mostrarMaterial();
                stage.show();
            }
        });
        
        //obrir formulari afegir material
         Ppal.getAltaMaterial().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {

                 ViewNouMaterial nouMaterials = new ViewNouMaterial();
                 ControllerAltaMaterial c = new ControllerAltaMaterial(nouMaterials);
                 c.initController(stage);
                Scene scn_nouMaterial = new Scene(nouMaterials.getRootPane(), 400, 350);
                stage.setTitle("afegir material");
                stage.setScene(scn_nouMaterial);
                
                stage.show();
            }
        });
         
         
          //mostrar formulari reserva material
         Ppal.getReservaMaterial().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {

                 ViewMaterials materials = new ViewMaterials();
                 ControllerForReservaMat c = new ControllerForReservaMat(materials);
                 c.initController(stage);
                Scene scn_material = new Scene(materials.getRootPane(), 400, 350);
                stage.setTitle("reserva material");
                stage.setScene(scn_material);
                
                stage.show();
            }
        });
    
     //mostrar formulari horari material
     
      Ppal.getHorariMat().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {

                 ViewForMostrarMat forMaterials = new ViewForMostrarMat();
                 ControllerForMostrarMat c = new ControllerForMostrarMat(forMaterials);
                 c.initController(stage);
                Scene scn_forMaterials = new Scene(forMaterials.getRootPane(), 400, 350);
                stage.setTitle("formulari horari material");
                stage.setScene(scn_forMaterials);
                
                stage.show();
            }
        });
     }
     public void mostrarSocis() {
        try {
            String cadena;
            String[] temp = new String[4];
            FileReader f = new FileReader("socis.csv");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                temp = cadena.split(";");
                HBox hb = new HBox();
                for (int i = 0; i < temp.length; i++) {
                    hb.getChildren().add(new Label(temp[i]+"  "));
                }
                llistaSocis.getVb().getChildren().add(hb);

            }
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public void mostrarReservas(){
        try {
            String cadena;
            FileReader f = new FileReader("reservas.csv");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                llistaReservas.getVb().getChildren().add(new Label (cadena));
            }
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     public void mostrarMaterial() {
        try {
            String cadena;
            String[] temp = new String[4];
            FileReader f = new FileReader("material.csv");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                temp = cadena.split(";");
                HBox hb = new HBox();
                for (int i = 0; i < temp.length; i++) {
                    hb.getChildren().add(new Label(temp[i]+"  "));
                }
                llistaMaterial.getVb().getChildren().add(hb);

            }
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

