/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6010613476;

/**
 *
 * @author Napasson
 */
public class Deluex extends Room {

    public void set(int r, boolean w, boolean s) {
        rate = r;
        wifi = w;
        status = s;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean getWifi() {
        return wifi;
    }

    public int getRate() {
        return rate;
    }

    public void statusChange() {
        if (status == true) {
            status = false;
        } else {
            status = true;
        }
    }
}
