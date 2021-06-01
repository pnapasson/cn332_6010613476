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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nod,type,bookingno,ld,d;
        char ch='y';
        double ff;
        String name;
        Deluex[dx] = new Deluex[3];
        Suit[idx] = new Suit[8];
        Customer[c] = new Customer[20];
        Laundry l[][][] = new Laundry[20][5][10];
        int i=0,j,k;
        for(i=0;i<3;i++){
            ly[i]=new Deluex();
            ly[i].set(2500,false,false);
            
        }
        for(i=0;i<8;i++){
            ly[i]=new Suit();
            ly[i].set(1500,false,false);
            
        }
         for(i=0;i<20;i++){
             c[i]=new Customer();  
        }    
         for(i=0;i<20;i++){
             b[i]=new Book();  
        }  
         String no;
         int isdx=0,idx=0;
         int flag1,flag2=0;
         System.out.println("What do you want todo?");
         System.out.println("Book a room(b)");
         System.out.println("Available a service(s)");
         System.out.println("Cancel a booked room(c)");
         System.out.println("Exit Menu(e)");
         Scanner in = new Scanner(System.in);
         ch = in.next("."),charAt(0);
         if(ch=='b')
         {
              for(i=0;i<3;i++){
                 if(dx[i].getStatus()==false)
                 {  idx=i;
                     flag1=1;
                    break;
                 }else
                 {flag1=0;}
             }
              for(i=0;i<8;i++){
                 if(idx[i].getStatus()==false)
                 {  dx=i;
                    flag2=1;
                    break;
                 }else
                 {flag2=0;}
             }              
         }
    }
    
}
