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
public class VzVV implements Serializable{
    private int idVozac;
    private int idVrstaVozaca;
    private Date expireDateLicence;
    private Date startDateLicence;
    private int id;

    public VzVV() {
    }

    public VzVV(int idVozac, int idVrstaVozaca, Date expireDateLicence, Date startDateLicence, int id) {
        this.idVozac = idVozac;
        this.idVrstaVozaca = idVrstaVozaca;
        this.expireDateLicence = expireDateLicence;
        this.startDateLicence = startDateLicence;
        this.id = id;
    }

    public Date getStartDateLicence() {
        return startDateLicence;
    }

    public void setStartDateLicence(Date startDateLicence) {
        this.startDateLicence = startDateLicence;
    }


    public int getIdVozac() {
        return idVozac;
    }

    public void setIdVozac(int idVozac) {
        this.idVozac = idVozac;
    }

    public int getIdVrstaVozaca() {
        return idVrstaVozaca;
    }

    public void setIdVrstaVozaca(int idVrstaVozaca) {
        this.idVrstaVozaca = idVrstaVozaca;
    }

    public Date getExpireDateLicence() {
        return expireDateLicence;
    }

    public void setExpireDateLicence(Date expireDateLicence) {
        this.expireDateLicence = expireDateLicence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VzVV{" + "idVozac=" + idVozac + ", idVrstaVozaca=" + idVrstaVozaca + ", expireDateLicence=" + expireDateLicence + ", startDateLicence=" + startDateLicence + ", id=" + id + '}';
    }
    
    
}
