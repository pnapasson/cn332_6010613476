/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6010613476;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Napasson
 */
public class Book implements Serializable {

    String bookno;
    Laundry l[][];
    int ff;
    Customer cust;
    int s1 = 0, s2 = 0;

    public String getBookingNumber() {
        return bookno;
    }

    public void BookNew(Customer c, Suit s, Deluxe dx, Laundry[][], int ily, int flag1, int idx, int flag2) {
        cust = c;
        Fare f = new Fare();
        int no, i;
        t = tr;
        l = lr;
        if (c.type == 1) {
            if (flag1 == 0) {
                System.out.println("No deleux Room Avaliable");
                Scanner in5 = new Scanner(System.in);
                System.out.println("Do you want any room? suit(2)");
                int g = in5.nextInt();
                if (g == 1) {
                    BookSuit(c, idx, g, dx, c.ld, c.d);
                }
            }
            if (c.type == 2) {
                if (flag2 == 0) {
                    System.out.println("No suit room available");
                    Scanner in6 = new Scanner(System.in);
                    System.out.println("Do you want any room? Deluex room(1)");
                    int g = in6.nextInt();
                    if (g == 2) {
                        BookDeluex(c, dx, g, idx, c.ld, c.d);
                    }
                }
            }
        }
    }

    public void BookDeleux(Customer c, Deluex dx, int type, int idx, int ld, int d) {
        dx.statuschange();
        Fare f = new Fare();
        if (ld == 1) {
            System.out.println("Deleux Room Booked");
            ff = f.farecalculator(d, dx.rate, ld);
            bookno = idx + "dx1";
            BookDisplay(ff, c.name, t[idx][0][0].getTotalCost(), l[idx][0][1].getTotalCost(), bookno);
        }
    }

    public void Suit(Customer c, Suit idx, int type, int dx, int ld, int d) {
        idx.statuschange();
        Fare f = new Fare();
        if (ld == 1) {
            System.out.println("Suit Room Booked");
            ff = f.farecalculator(d, idx.rate, ld);
            bookno = idx + "dx1";
            BookDisplay(ff, c.name, t[dx][0][0].getTotalCost(), l[dx][0][1].getTotalCost(), bookno);
        }
    }

    public void BookDisplay(int ff, String name, int tr, int lr, String b) {
        System.out.println("Booking number" + bookno);
        System.out.println("Customer Number" + cust.no);
        System.out.println("Booking Name" + name);
        System.out.println("Fare is" + ff);
        System.out.println("Total Cost of laundry is " + lr);
    }

    public int getFare() {
        return ff;
    }

    public String getName() {
        return cust.name;
    }
}
