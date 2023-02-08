package crem;

import control.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.*;


public class App extends Application {

    
    public void start(Stage primaryStage) {

        
        //Ferran
        ViewLogin login = new ViewLogin();
        ViewPpal Ppal = new ViewPpal();
        ViewAltaSocis altaSoci = new ViewAltaSocis(); 
        ViewLlistaMaterials llistaMaterial = new ViewLlistaMaterials();
        ViewLlistaReserves llistaReserves = new ViewLlistaReserves();
        ViewLlistaSocis llistaSocis = new ViewLlistaSocis();
        ViewMaterials materials = new ViewMaterials();
        ViewReserva reserva = new ViewReserva();
        ViewMostrarHorari mostrarHorari = new ViewMostrarHorari();
        ViewHorari horaris = new ViewHorari();
        ViewCancelReservaMaterial cancelReservaMaterial = new ViewCancelReservaMaterial();
        ViewNouMaterial nouMaterial = new ViewNouMaterial();

        ViewBaixaSoci baixaSoci = new ViewBaixaSoci();
        

        Controller c = new Controller(login,Ppal,altaSoci,llistaSocis,mostrarHorari,horaris,reserva,llistaReserves,baixaSoci,nouMaterial,materials);

        
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(login.getPane(),300,200));
        primaryStage.show();
        c.initController(primaryStage);
        
    }

    public static void main(String[] args) {
        launch(args);
    }


    
}
    