/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;

/**
 *
 * @author Marko
 */
public class VrstaVozaca implements Serializable{
    private int idVrstaVozaca;
    private String driverLicence;
    private String vehicle;

    public VrstaVozaca() {
    }

    public VrstaVozaca(int idVrstaVozaca, String driverLicence, String vehicle) {
        this.idVrstaVozaca = idVrstaVozaca;
        this.driverLicence = driverLicence;
        this.vehicle = vehicle;
    }

    public int getIdVrstaVozaca() {
        return idVrstaVozaca;
    }

    public void setIdVrstaVozaca(int idVrstaVozaca) {
        this.idVrstaVozaca = idVrstaVozaca;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return vehicle;
    }

  

   
    
    
}
