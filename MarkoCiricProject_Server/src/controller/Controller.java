/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBBroker;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import util.Mesto;
import util.NarucilacUsluge;
import util.Otpremnica;
import util.Roba;
import util.StavkaOtpremnice;
import util.Vozac;
import util.VrstaVozaca;
import util.VzVV;

/**
 *
 * @author Marko
 */
public class Controller {

    private static Controller instance;
    private DBBroker dbb;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Controller() {
        dbb = new DBBroker();
    }

    public List<Vozac> getListVozac() {
        return dbb.getListVozac();
    }

    public boolean updateVozac(Vozac v) {
        return dbb.updateVozac(v);
    }

    public boolean deleteVozac(int deleteVozac) {
        return dbb.deleteVozac(deleteVozac);
    }

    public boolean createVozac() {
       return dbb.createVozac();
    }

    public static boolean validateTextFields(List<JTextField> textFields) {
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 2);
        boolean allFilled = true;

        for (JTextField textField : textFields) {
            if (textField.getText().trim().isEmpty()) {
                textField.setBorder(redBorder);
                textField.setBackground(new Color(255, 224, 203));
                allFilled = false; // Ako nađe prazno polje, postavlja na false
            } else {
                textField.setBorder(UIManager.getBorder("TextField.border"));
                textField.setBackground(Color.WHITE);
            }
        }

        return allFilled;
    }

    public void checkboxChecked(JCheckBox checkBoxPassword, JPasswordField txtPassword) {
        checkBoxPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPassword();
            }

            private void showPassword() {
                if (checkBoxPassword.isSelected()) {
                    String password = new String(txtPassword.getPassword());
                    txtPassword.setText(password);
                    txtPassword.setEchoChar((char) 0);

                } else {
                    txtPassword.setEchoChar('\u2022');
                }
            }
        });
    }

    public void checkMail(JTextField txtMail, JLabel lblError) {

        txtMail.getDocument().addDocumentListener(new DocumentListener() {
            private final String EMAIL_REGEX = "^[a-z0-9.]+@[a-z.]+\\.[a-z]{2,6}$";

            public boolean isValidEmail(String email) {
                Pattern pattern = Pattern.compile(EMAIL_REGEX);
                Matcher matcher = pattern.matcher(email);
                return matcher.matches();
            }

            private void validate(DocumentEvent e) {

                try {
                    String text = e.getDocument().getText(0, e.getDocument().getLength());
                    if (isValidEmail(text)) {
                        lblError.setText("");
                    } else {
                        lblError.setText("Loš format email-a");
                    }
                } catch (BadLocationException ex) {

                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                validate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });

    }

    public void checkPhone(JTextField txtPhoneNumber, JLabel lblErrorPhone) {
        txtPhoneNumber.getDocument().addDocumentListener(new DocumentListener() {
            private final String PHONE_REGEX = "^\\+381\\d{8,9}$|^06\\d{7,8}$";

            public boolean isValidPhone(String phone) {
                Pattern pattern = Pattern.compile(PHONE_REGEX);
                Matcher matcher = pattern.matcher(phone);
                return matcher.matches();
            }

            private void validate(DocumentEvent e) {

                try {
                    String text = e.getDocument().getText(0, e.getDocument().getLength());
                    if (isValidPhone(text)) {
                        lblErrorPhone.setText("");
                    } else {
                        lblErrorPhone.setText("Loš format broja(+381 ili 06 na pocetku)");
                    }
                } catch (BadLocationException ex) {

                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                validate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });
    }

    public void checkName(JTextField txtName, JLabel lblErrorNameLastName, String out) {

        txtName.getDocument().addDocumentListener(new DocumentListener() {

            private final String NAME_REGEX = "[A-ZČĆŠĐ][a-zčćšđ]+$";

            public boolean isValidNameLastName(String phone) {
                Pattern pattern = Pattern.compile(NAME_REGEX);
                Matcher matcher = pattern.matcher(phone);
                return matcher.matches();
            }

            private void validate(DocumentEvent e) {

                try {
                    String text = e.getDocument().getText(0, e.getDocument().getLength());
                    if (isValidNameLastName(text)) {
                        lblErrorNameLastName.setText("");
                    } else {
                        lblErrorNameLastName.setText(out);
                    }
                } catch (BadLocationException ex) {

                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                validate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });

    }

    public List<Otpremnica> getListOtpremnica() {
        return dbb.getListOtpremnica();
    }

    public String convertDate(Date datum) {
        Calendar c = Calendar.getInstance();
        c.setTime(datum);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int m = c.get(Calendar.MONTH) + 1;
        int y = c.get(Calendar.YEAR);
        return d + "." + m + "." + y + ".";
    }
    
    public String convertDateForDB(Date datum) {
        Calendar c = Calendar.getInstance();
        c.setTime(datum);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int m = c.get(Calendar.MONTH) + 1;
        int y = c.get(Calendar.YEAR);
        return y + "-" + m + "-" + d;
    }
    public List<String> getVehicles(int idVozac) {
        return dbb.getVehicles(idVozac);
    }

    public boolean deleteOtpremnica(Otpremnica deleteOtpremnica) {
        return dbb.deleteOtpremnica(deleteOtpremnica);
    }

    public List<VzVV> getListVzVV(int idVozac) {
        return dbb.getVzVV(idVozac);
    }

    public VrstaVozaca findVrstaVozaca(int idVrstaVozaca) {
        return dbb.findVrstaVozaca(idVrstaVozaca);
    }

    public void sendMail(String mail, String randomPass) {

        final String username = "prevozrobedoo@gmail.com";
        final String password = "fszh kpvh prgx abqa";
        //

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Kreiranje sesije
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail));
            message.setSubject("Vaša privremena šifra");
            message.setText("U mejlu se nalazi privremena šifra koju ćete uneti u aplikaciju kako biste mogli da nastavite sa registracijom."
                    + "\n\nPrivremena šifra: " + randomPass);

            Transport.send(message);

            System.out.println("Mejl poslat!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public String generateRandomPassword() {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String allowedChars = upperCaseLetters + lowerCaseLetters + numbers;

        int passwordLength = 8;

        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }
        return password.toString();
    }

    public int insertVozac(Vozac v) {
        return dbb.insertNewVozac(v);
    }

    public String hashPassword(String password) {
        String input = password;
        try {
            // Kreiranje instance MessageDigest za algoritam SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Pretvaranje ulaznog stringa u bajte i hesiranje
            byte[] hashBytes = digest.digest(input.getBytes());

            // Konvertovanje hesiranog niza bajtova u heksadecimalni string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0'); // Dodaj nulu ako je potrebno
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Algoritam nije pronađen: " + e.getMessage());
        }
        return null;
    }

    public List<VrstaVozaca> getListVrstaVozaca() {
        return dbb.getListVrstaVozaca();
    }

    public boolean updateVzVV(VzVV v) {
        return dbb.updateVzVV(v);
    }

    public boolean deleteVzVV(int delete) {
        return dbb.deleteVzVV(delete);
    }

    public boolean insertVzVV(VzVV v) {
        return dbb.insertVzVV(v);
    }

    public boolean deleteVrstaVozaca(int delete) {
        return dbb.deleteVrstaVozaca(delete);
    }

    public boolean insertVrstaVozaca(VrstaVozaca v) {
        return dbb.insertVrstaVozaca(v);
    }

    public List<Roba> getListRoba() {
        return dbb.getListRoba();
    }

    public boolean deleteRoba(int delete) {
        return dbb.deleteRoba(delete);
    }

    public boolean updateRoba(Roba r) {
        return dbb.updateRoba(r);
    }

    public boolean insertRoba(Roba r) {
        return dbb.insertRoba(r);
    }

    public List<NarucilacUsluge> getListNarucilacUsluge(HashMap<Integer, String> needSort) {
        return dbb.getListNarucilacUsluge(needSort);
    }

    public List<StavkaOtpremnice> getListStavkeOtpremnice(int idOtpremnica) {
        return dbb.getListStavkeOtpremnice(idOtpremnica);
    }

    public double sumPrices(int idOtpremnica) {
        return dbb.sumPrices(idOtpremnica);
    }

    public String formatNumber(double total) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);

        String roundTotal = df.format(total);
        return roundTotal;
    }

    public VzVV getVzVV(VzVV v) {
        return dbb.getVzVV(v);
    }

    public static boolean isValidDate(String date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(date); 
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public List<Mesto> getListMesto() {
        return dbb.getListMesto();
    }

    public boolean updateQtySO(StavkaOtpremnice so) {
         return dbb.updateQtySO(so);
    }

    public int insertStavkaOtpremnice(StavkaOtpremnice so) {
       return dbb.insertStavkaOtpremnice(so);
    }

    public boolean deleteStavkaOtpremnice(int delete) {
        return dbb.deleteStavkaOtpremnice(delete);
    }

    public boolean updateOtpremnica(Otpremnica o) {
       return dbb.updateOtpremnica(o);
    }

    public boolean updateNarucilacUsluge(NarucilacUsluge nu) {
       return dbb.updateNarucilacUsluge(nu);
    }

    public int insertNarucilacUsluge(NarucilacUsluge nu) {
        return dbb.insertNarucilacUsluge(nu);
    }

    public int insertOtpremnica(Otpremnica o) {
        return dbb.insertOtpremnica(o);
    }

    
}
