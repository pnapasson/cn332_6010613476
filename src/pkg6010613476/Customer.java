/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6010613476;

import java.util.Scanner;

/**
 *
 * @author Napasson
 */
public class Customer {
    int no;
    String name;
    String bookingno;
    int nod,type,ld,d;
    boolean status;
    Customer(){
        no=-1;
        name=null;
        bookingno=null;
        nod=type=ld=d=-1;
        status=false;
    }
    public void setInitialDetails(int c){
        no=c;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        System.out.println("Enter room type? 1  for deluex,2 for suit");
        type = in.nextInt();
        System.out.println("Enter Occupany? 1/2");
        ld= in.nextInt();
        System.out.println("Enter number of days?");
        d = in.nextInt();
    }
    public void setBookingNo(String b){
        bookingno=b;
    }
}
