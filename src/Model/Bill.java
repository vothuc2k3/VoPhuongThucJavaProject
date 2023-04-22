/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hughey
 */
public class Bill {

    String switchName;
    int quantity;
    Switch s;

    public Bill() {
    }

    public Bill(String switchName, int quantity) {
        this.switchName = switchName;
        this.quantity = quantity;
    }
    
    

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Switch getS() {
        return s;
    }

    public void setS(Switch s) {
        this.s = s;
    }
}
