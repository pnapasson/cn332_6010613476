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
abstract public class Service {
    int type;
    int cost;
    int quantity;
    String bno;
    boolean status;
   Service(){
       type =0;
       cost=0;
       quantity = 0;
       bno=null;
       status = false;
   }
   abstract public void setDetails();
   abstract public int getTotalCost();
   abstract public boolean getStatus();
    
}
