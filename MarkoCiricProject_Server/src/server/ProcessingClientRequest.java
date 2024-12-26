/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import controller.Controller;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import operations.Operations;
import transfer.ClientRequest;
import transfer.ServerResponse;
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
public class ProcessingClientRequest extends Thread {

    private Socket s;

    public ProcessingClientRequest(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            ClientRequest clientRequest = getRequest();
            ServerResponse serverResponse = new ServerResponse();
            switch (clientRequest.getOperation()) {
                case getListVozac:
                    List<Vozac> list = Controller.getInstance().getListVozac();
                    serverResponse.setResponse(list);
                    break;
                case updateVozac:
                    Vozac v = (Vozac) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().updateVozac(v));
                    break;
                case deleteVozac:
                    int v1 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().deleteVozac(v1));
                    break;
                case createVozac:
                    serverResponse.setResponse(Controller.getInstance().createVozac());
                    break;
                case validateTextFields:
                    List<JTextField> textFields = (List<JTextField>) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().validateTextFields(textFields));
                    break;
                case getListOtpremnica:
                    serverResponse.setResponse(Controller.getInstance().getListOtpremnica());
                    break;
                case getVehicles:
                    int v2 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().getVehicles(v2));
                    break;
                case getListVzVV:
                   int v3 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().getListVzVV(v3));
                    break;
                case deleteOtpremnica:
                    Otpremnica o = (Otpremnica) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().deleteOtpremnica(o));
                    break;
                case findVrstaVozaca:
                    int vv = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().findVrstaVozaca(vv));
                    break;
                case insertVozac:
                    Vozac v4 = (Vozac) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertVozac(v4));
                    break;
                case getListVrstaVozaca:
                    serverResponse.setResponse(Controller.getInstance().getListVrstaVozaca());
                    break;
                case updateVzVV:
                    VzVV vzvv = (VzVV) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().updateVzVV(vzvv));
                    break;
                case deleteVzVV:
                    int vzvv1 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().deleteVzVV(vzvv1));
                    break;
                case insertVzVV:
                    VzVV vzvv3 = (VzVV) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertVzVV(vzvv3));
                    break;
                case deleteVrstaVozaca:
                    int vzvv2 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().deleteVrstaVozaca(vzvv2));
                    break;
                case insertVrstaVozaca:
                    VrstaVozaca vv1 = (VrstaVozaca) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertVrstaVozaca(vv1));
                    break;
                case getListRoba:
                    serverResponse.setResponse(Controller.getInstance().getListRoba());
                    break;
                case deleteRoba:
                    int r = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().deleteRoba(r));
                    break;
                case updateRoba:
                    Roba r1 = (Roba) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().updateRoba(r1));
                    break;
                case insertRoba:
                    Roba r2 = (Roba) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertRoba(r2));
                    break;
                case getListNarucilacUsluge:
                    HashMap<Integer, String> map = (HashMap<Integer, String>) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().getListNarucilacUsluge(map));
                    break;
                case getListStavkeOtpremnice:
                    int so = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().getListStavkeOtpremnice(so));
                    break;
                case sumPrices:
                    int o1 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().sumPrices(o1));
                    break;
                case getVzVV:
                    VzVV vzvv5 = (VzVV) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().getVzVV(vzvv5));
                    break;
                case getListMesto:
                    serverResponse.setResponse(Controller.getInstance().getListMesto());
                    break;
                case updateQtySO:
                    StavkaOtpremnice so1 = (StavkaOtpremnice) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().updateQtySO(so1));
                    break;
                case insertStavkaOtpremnice:
                    StavkaOtpremnice so2 = (StavkaOtpremnice) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertStavkaOtpremnice(so2));
                    break;
                case deleteStavkaOtpremnice:
                    int so3 = (int) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().deleteStavkaOtpremnice(so3));
                    break;
                case updateOtpremnica:
                    Otpremnica o2 = (Otpremnica) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().updateOtpremnica(o2));
                    break;
                case updateNarucilacUsluge:
                    NarucilacUsluge nu = (NarucilacUsluge) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().updateNarucilacUsluge(nu));
                    break;
                case insertNarucilacUsluge:
                    NarucilacUsluge nu2 = (NarucilacUsluge) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertNarucilacUsluge(nu2));
                    break;
                case insertOtpremnica:
                    Otpremnica o3 = (Otpremnica) clientRequest.getParam();
                    serverResponse.setResponse(Controller.getInstance().insertOtpremnica(o3));
                    break;
                default:
                    System.out.println("greska");
                //ovde izlistati operacije koje klijent moze da izvrsi
            }

            sendResponse(serverResponse);
        }
    }

    private ClientRequest getRequest() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(s.getInputStream());
            return (ClientRequest) inputStream.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProcessingClientRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void sendResponse(ServerResponse response) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(s.getOutputStream());
            outputStream.writeObject(response);
            outputStream.flush();
        } catch (IOException ex) {
            Logger.getLogger(ProcessingClientRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
