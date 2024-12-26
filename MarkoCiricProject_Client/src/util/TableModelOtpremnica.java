/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import controller.Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko
 */
public class TableModelOtpremnica extends AbstractTableModel {

    List<Otpremnica> list = new ArrayList<>();
    String columns[] = {"Naručilac usluge", "Vršilac usluge", "Mesto i poštanski broj", "Datum"}; //dovrsiti table model

    public TableModelOtpremnica(List<Otpremnica> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Otpremnica o = list.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return o.getNarucilacUsluge().getName() + " " + o.getNarucilacUsluge().getLastName();
                case 1:
                    return o.getVozac().getNameVozac() + " " + o.getVozac().getLastNameVozac();
                case 2:
                    return o.getNarucilacUsluge().getMesto().getLocation() + " " + o.getNarucilacUsluge().getMesto().getZipcode();
                case 3:
                    return Controller.getInstance().convertDate(o.getDatum());
                default:
                    throw new AssertionError();
            }
        } catch (IOException ex) {
            Logger.getLogger(TableModelOtpremnica.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    

}
