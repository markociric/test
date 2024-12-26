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
public class StavkaOtpremnice implements Serializable{
    private int idOtpremnica;
    private int id;
    private Roba idRoba;
    private double qty;

    public StavkaOtpremnice() {
    }

    public StavkaOtpremnice(int idOtpremnica, int id, Roba idRoba, double qty) {
        this.idOtpremnica = idOtpremnica;
        this.id = id;
        this.idRoba = idRoba;
        this.qty = qty;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getIdOtpremnica() {
        return idOtpremnica;
    }

    public void setIdOtpremnica(int idOtpremnica) {
        this.idOtpremnica = idOtpremnica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Roba getIdRoba() {
        return idRoba;
    }

    public void setIdRoba(Roba idRoba) {
        this.idRoba = idRoba;
    }

    @Override
    public String toString() {
        return "StavkaOtpremnice{" + "idOtpremnica=" + idOtpremnica + ", id=" + id + ", idRoba=" + idRoba + ", qty=" + qty + '}';
    }
    
    
}
