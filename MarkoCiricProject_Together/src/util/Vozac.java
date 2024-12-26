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
public class Vozac implements Serializable{
    private int idVozac;
    private String nameVozac;
    private String lastNameVozac;
    private String phoneNumber;
    private String email;
    private String password;
    

    public Vozac() {
    }

    public Vozac(int idVozac, String nameVozac, String lastNameVozac, String phoneNumber, String email, String password) {
        this.idVozac = idVozac;
        this.nameVozac = nameVozac;
        this.lastNameVozac = lastNameVozac;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
       
    }

    public int getIdVozac() {
        return idVozac;
    }

    public void setIdVozac(int idVozac) {
        this.idVozac = idVozac;
    }

    public String getNameVozac() {
        return nameVozac;
    }

    public void setNameVozac(String nameVozac) {
        this.nameVozac = nameVozac;
    }

    public String getLastNameVozac() {
        return lastNameVozac;
    }

    public void setLastNameVozac(String lastNameVozac) {
        this.lastNameVozac = lastNameVozac;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  nameVozac + " " + lastNameVozac;
    }
    
    
}
