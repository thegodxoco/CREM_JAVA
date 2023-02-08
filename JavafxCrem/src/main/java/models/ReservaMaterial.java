/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author garci
 */
public class ReservaMaterial {
    private String material;
    private int quantitat;
    private String data;
    private String horaInici;
    private String horaFinal;

    public ReservaMaterial(String material, int quantitat, String data, String horaInici, String horaFinal) {
        this.material = material;
        this.quantitat = quantitat;
        this.data = data;
        this.horaInici = horaInici;
        this.horaFinal = horaFinal;
        
       HorariMaterial horariMat = new HorariMaterial(material,quantitat,data,horaInici,horaFinal);
       
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public String getData() {
        return data;
    }

    public String getHoraInici() {
        return horaInici;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
    
    
  
      
    
    
    
    
}
