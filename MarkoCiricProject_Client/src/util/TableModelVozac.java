/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko
 */
public class TableModelVozac extends AbstractTableModel {
    List<Vozac> listVozac = new ArrayList<>();
    String columns[] = {"Ime i Prezime","Broj Telefona", "Mail"};

    public TableModelVozac(List<Vozac> listVozac) {
        this.listVozac = listVozac;
    }
    
    @Override
    public int getRowCount() {
        return listVozac.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vozac v = listVozac.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return v.getNameVozac() + " " + v.getLastNameVozac();
            case 1:
                return v.getPhoneNumber();
            case 2:
                return v.getEmail();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
}
