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
public class TableModelStavkeOtpremnice extends AbstractTableModel {

    List<StavkaOtpremnice> list = new ArrayList<>();
    String columns[] = {"Redni broj","Naziv robe", "Količina", "Merna jedinica", "Jedinična cena (u dinarima)", "Iznos",}; //dovrsiti table model

    public TableModelStavkeOtpremnice(List<StavkaOtpremnice> list) {
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
            StavkaOtpremnice so = list.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return rowIndex+1 + ".";
                case 1:
                    return so.getIdRoba().getNameRoba();
                case 2:
                    return so.getQty();
                case 3:
                    return so.getIdRoba().getUnitOfMeasure();
                case 4:
                    return so.getIdRoba().getPrice();
                case 5:
                    return  Controller.getInstance().formatNumber(so.getIdRoba().getPrice() * so.getQty());
                default:
                    throw new AssertionError();
            }
        } catch (IOException ex) {
            Logger.getLogger(TableModelStavkeOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;
    }
    
    
}
