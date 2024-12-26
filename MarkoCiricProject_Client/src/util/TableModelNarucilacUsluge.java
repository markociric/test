/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import controller.Controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko
 */
public class TableModelNarucilacUsluge extends AbstractTableModel {

    List<NarucilacUsluge> list = new ArrayList<>();
    String columns[] = {"Ime i prezime", "Adresa", "Mesto i poštanski broj", "Email","Broj telefona"};

    public TableModelNarucilacUsluge(List<NarucilacUsluge> list) {
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
        NarucilacUsluge nu = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return nu.getName() + " " + nu.getLastName();
            case 1:
                return nu.getAdress();
            case 2:
                return nu.getMesto().getLocation() + " " + nu.getMesto().getZipcode();
            case 3:
                return nu.getEmail();
            case 4:
                return nu.getPhone();
            default:
                throw new AssertionError();
        }
       
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    

}
