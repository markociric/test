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
public class TableModelVrstaVozaca extends AbstractTableModel {

    List<VrstaVozaca> list = new ArrayList<>();

    public TableModelVrstaVozaca(List<VrstaVozaca> list) {
        this.list = list;
    }
    String columns[] = {"Vrsta prevoznog sredstva", "Kategorija dozvole"};

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
        VrstaVozaca v = list.get(rowIndex);
       
        switch (columnIndex) {
            case 0:
                return v.getVehicle();
            case 1:
                return v.getDriverLicence();
          
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
}
