/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;
import operations.Operations;

/**
 *
 * @author Marko
 */
public class ClientRequest implements Serializable{
    private Operations operation;
    private Object param;

    public ClientRequest() {
    }

    public ClientRequest(Operations operation, Object param) {
        this.operation = operation;
        this.param = param;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }
    
    
}
