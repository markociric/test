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
public class TableModelRoba extends AbstractTableModel {

    List<Roba> list = new ArrayList<>();

    public TableModelRoba(List<Roba> list) {
        this.list = list;
    }
    String columns[] = {"Vrsta robe", "Količina", " Merna jedinica", "Jedinična cena"};

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
        Roba r = list.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return r.getNameRoba();
            case 1:
                return r.getQty();
            case 2:
                return r.getUnitOfMeasure();
            case 3:
                return r.getPrice();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

}
