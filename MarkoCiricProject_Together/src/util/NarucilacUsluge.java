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
public class NarucilacUsluge implements Serializable{
    private int idNarucilacUsluge;
    private String name;
    private String lastName;
    private String adress;
    private String phone;
    private String email;
    private Mesto mesto;

    public NarucilacUsluge() {
    }

    public NarucilacUsluge(int idNarucilacUsluge, String name, String lastName, String adress, String phone, String email, Mesto mesto) {
        this.idNarucilacUsluge = idNarucilacUsluge;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.mesto = mesto;
    }

    public int getIdNarucilacUsluge() {
        return idNarucilacUsluge;
    }

    public void setIdNarucilacUsluge(int idNarucilacUsluge) {
        this.idNarucilacUsluge = idNarucilacUsluge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
    
    
    
}
