/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forms;

import controller.Controller;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.Vozac;

/**
 *
 * @author Marko
 */
public class UpdateVozacForm extends javax.swing.JDialog {

    ImageIcon infoIcon = new ImageIcon("info.png");
    private Locale current;
    private ResourceBundle messages;

    /**
     * Creates new form UpdateVozacFormm
     *
     * @param parent
     * @param modal
     * @param updateVozac
     * @param currentLocale
     */
    public UpdateVozacForm(java.awt.Frame parent, boolean modal, Vozac updateVozac, Locale currentLocale) throws IOException {
        super(parent, modal);
        initComponents();
        current = currentLocale;
        addListeners();
        loadLanguage();
        updateTexts();
        txtId.setText(updateVozac.getIdVozac() + "");
        txtId.setEnabled(false);
        txtName.setText(updateVozac.getNameVozac());
        txtLastName.setText(updateVozac.getLastNameVozac());
        txtPhoneNumber.setText(updateVozac.getPhoneNumber());
        txtMail.setText(updateVozac.getEmail());
        txtPassword.setText(updateVozac.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        btnSaveChanges = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        checkBoxPassword = new javax.swing.JCheckBox();
        lblErrorLastName = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorMail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id:");

        lblName.setText("Ime:");

        lblLastName.setText("Prezime:");

        lblPhone.setText("Broj telefona:");

        lblMail.setText("Mail:");

        btnSaveChanges.setText("Sacuvaj izmene");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        checkBoxPassword.setText("prikazi sifru");

        lblErrorLastName.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorName.setForeground(new java.awt.Color(255, 0, 51));

        lblErrorPhone.setForeground(new java.awt.Color(255, 0, 51));

        lblErrorMail.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSaveChanges)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhone)
                        .addGap(37, 37, 37)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLastName)
                        .addGap(37, 37, 37)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(37, 37, 37)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMail)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(checkBoxPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorMail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLastName)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblErrorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPhone)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblErrorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMail)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblErrorMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkBoxPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnSaveChanges)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        if (lblErrorName.getText().trim().equals("") && lblErrorLastName.getText().trim().equals("")
                && lblErrorPhone.getText().trim().equals("") && lblErrorMail.getText().trim().equals("")) {
            int answer = switch (current.getLanguage()) {
                case "sr" ->
                    JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da želite da sačuvate novounete podatke?", "Potvrda", JOptionPane.YES_NO_OPTION);

                case "sr_cir" ->
                    JOptionPane.showConfirmDialog(rootPane, "Да ли сте сигурни да желите да сачувате новоунете податке?", "Потврда", JOptionPane.YES_NO_OPTION);

                default ->
                    JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to save the newly entered data?", "Confirmation", JOptionPane.YES_NO_OPTION);

            };
            if (answer == JOptionPane.YES_OPTION) {
                try {
                    int id = Integer.parseInt(txtId.getText());
                    String name = txtName.getText();
                    String lastname = txtLastName.getText();
                    String phone = txtPhoneNumber.getText();
                    String mail = txtMail.getText();
                    String pass = String.valueOf(txtPassword.getPassword());
                    Vozac param = new Vozac(id, name, lastname, phone, mail, pass);
                    boolean responce = Controller.getInstance().updateVozac(param);

                    if (responce) {
                        switch (current.getLanguage()) {
                            case "sr" ->
                                JOptionPane.showMessageDialog(this, "Uspešno sačuvane promene");
                            case "sr_cir" ->
                                JOptionPane.showMessageDialog(this, "Успешно сачуване промене");
                            default ->
                                JOptionPane.showMessageDialog(this, "Successfully saved changes");
                        }
                        
                        this.dispose();
                    } else {
                        switch (current.getLanguage()) {
                            case "sr" ->
                                JOptionPane.showMessageDialog(this, "Greska pri čuvanju izmena u bazi", "Greška", JOptionPane.ERROR_MESSAGE);
                            case "sr_cir" ->
                                JOptionPane.showMessageDialog(this, "Грешка при чувању измена у бази", "Грешка", JOptionPane.ERROR_MESSAGE);
                            default ->
                                JOptionPane.showMessageDialog(this, "Error when saving changes in the database", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                            
                    }
                } catch (IOException ex) {
                    Logger.getLogger(UpdateVozacForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                this.dispose();
            }
        } else {
            switch (current.getLanguage()) {
                case "sr" ->
                    JOptionPane.showMessageDialog(this, "Greška, nisu uneti pravilno svi podaci", "Greška", JOptionPane.ERROR_MESSAGE);
                case "sr_cir" ->
                    JOptionPane.showMessageDialog(this, "Грешка, нису унети правилно сви подаци", "Грешка", JOptionPane.ERROR_MESSAGE);
                default ->
                    JOptionPane.showMessageDialog(this, "Error, not all data was entered correctly", "Error", JOptionPane.ERROR_MESSAGE);
            }
            

        }


    }//GEN-LAST:event_btnSaveChangesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox checkBoxPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblErrorLastName;
    private javax.swing.JLabel lblErrorMail;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void addListeners() throws IOException {
        Controller.getInstance().checkboxChecked(checkBoxPassword, txtPassword);
        Controller.getInstance().checkMail(txtMail, lblErrorMail, current);
        Controller.getInstance().checkPhone(txtPhoneNumber, lblErrorPhone, current);
        switch (current.getLanguage()) {
            case "sr":
                Controller.getInstance().checkName(txtName, lblErrorName, "Loš unos imena.");
                Controller.getInstance().checkName(txtLastName, lblErrorLastName, "Loš unos prezimena.");
                break;
            case "sr_cir":
                Controller.getInstance().checkName(txtName, lblErrorName, "Лош унос имена.");
                Controller.getInstance().checkName(txtLastName, lblErrorLastName, "Лош унос презимена.");
                break;
            default:
                Controller.getInstance().checkName(txtName, lblErrorName, "Bad name input.");
                Controller.getInstance().checkName(txtLastName, lblErrorLastName, "Bad lastname input.");
                break;

        }

    }

    public void loadLanguage() {
        try {
            messages = ResourceBundle.getBundle("translate.messages", current);
        } catch (Exception e) {
            System.err.println("Greška pri učitavanju jezika: " + e.getMessage());
        }
    }

    public void updateTexts() {
        lblLastName.setText(messages.getString("lblLastName.text"));
        lblMail.setText(messages.getString("lblMail.text"));
        lblName.setText(messages.getString("lblName.text"));
        lblPhone.setText(messages.getString("lblPhone.text"));
        btnSaveChanges.setText(messages.getString("btnSaveChanges.text"));
        checkBoxPassword.setText(messages.getString("checkBoxPassword.text"));
    }

}
