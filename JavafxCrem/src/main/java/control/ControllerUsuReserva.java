/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.*;

/**
 *
 * @author garci
 */
public class ControllerUsuReserva {
    private ViewUsuReserva usuReserva;

    public ControllerUsuReserva(ViewUsuReserva usuReserva) {
        this.usuReserva = usuReserva;
    }
    
    
     public void initView() {

    }
     public void initController(Stage stage){
         
         usuReserva.getGuardar().setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event) {
                 guardarFitxer();
                 usuReserva = new ViewUsuReserva();
                 
                
            }
        });
         
         usuReserva.getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                ViewPpal ppal = new ViewPpal();
                ControllerPpal c = new ControllerPpal(ppal);
                c.initController(stage);
                Scene scn_principal = new Scene(ppal.getPane(), 400, 350);
                
                    stage.setTitle("Menu principal");
                    stage.setScene(scn_principal);
                    stage.show();
                   
                
                
            }
        });
    
    }
     
      public void guardarFitxer(){
        
        try{
        FileOutputStream fos= new FileOutputStream("reservas.csv",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        PrintWriter pw = new PrintWriter(osw);
        
        pw.print("- "+this.usuReserva.getNomTextField().getText()+";"+this.usuReserva.getPrimerCognomTextField().getText()+";"+this.usuReserva.getDNITextField().getText());
        /*for(int i=0;i<this.Usuaris.length-1;i++){
             pw.print(";"+Usuaris[i].getDNI());
        }*/
           
        pw.print("\n");
        pw.close();
        
        }catch(Exception e){
            
         e.printStackTrace();
        }
    }
}
