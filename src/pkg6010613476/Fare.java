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
public class Fare {
    public int farecalculator(int days,int rate,int s){
        if(s==1){
            return days*rate;
        }
        if(s==2){
            return days*rate*2
;        }
        return 0;
    }
}
