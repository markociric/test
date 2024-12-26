/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Marko
 */
public class Otpremnica implements Serializable{
    private int idOtpremnica;
    private Date datum;
    private Vozac vozac;
    private NarucilacUsluge narucilacUsluge;
    
    public Otpremnica() {
        
    }

    public Otpremnica(int idOtpremnica, Date datum, Vozac vozac, NarucilacUsluge narucilacUsluge) {
        this.idOtpremnica = idOtpremnica;
        this.datum = datum;
        this.vozac = vozac;
        this.narucilacUsluge = narucilacUsluge;
        
    }


    public int getIdOtpremnica() {
        return idOtpremnica;
    }

    public void setIdOtpremnica(int idOtpremnica) {
        this.idOtpremnica = idOtpremnica;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public NarucilacUsluge getNarucilacUsluge() {
        return narucilacUsluge;
    }

    public void setNarucilacUsluge(NarucilacUsluge narucilacUsluge) {
        this.narucilacUsluge = narucilacUsluge;
    }
    
}
