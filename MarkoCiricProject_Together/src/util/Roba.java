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
public class Roba implements Serializable{
   
    private int idRoba;
    private String nameRoba;
    private double Qty;
    private String unitOfMeasure;
    private double price;
    
    public Roba() {
    }

    public Roba(int idRoba, String nameRoba, double Qty, String unitOfMeasure, double price) {
        this.idRoba = idRoba;
        this.nameRoba = nameRoba;
        this.Qty = Qty;
        this.unitOfMeasure = unitOfMeasure;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    public int getIdRoba() {
        return idRoba;
    }

    public void setIdRoba(int idRoba) {
        this.idRoba = idRoba;
    }

    public String getNameRoba() {
        return nameRoba;
    }

    public void setNameRoba(String nameRoba) {
        this.nameRoba = nameRoba;
    }

    public double getQty() {
        return Qty;
    }

    public void setQty(double Qty) {
        this.Qty = Qty;
    }

    @Override
    public String toString() {
        return nameRoba;
    }
    
    
}
