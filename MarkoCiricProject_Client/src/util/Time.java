/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author student2
 */
public class Time implements Runnable{

    JLabel labelTime;
    JLabel labelDate;

    public Time(JLabel labelTime, JLabel labelDate) {
        this.labelTime = labelTime;
        this.labelDate = labelDate;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Prekinuto spavanje!");
            }
            labelTime.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            labelDate.setText(new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));

        }
    }
    
}
