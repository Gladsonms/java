/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.bill;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class ElectricityBill {

    public static void main(String[] args) {
   Scanner in =new Scanner(system.in);
   double cno,uno,amt;
        System.out.println("enter the customer no");
cno=in.nextInt();
        System.out.println("enter the number of units");
uno=in.nextInt();
        if (uno<50) {
            amt=1.5*uno;
            }
        else if(uno>50&&uno<100)
        {
            amt =2.8*uno;}
else if(uno>200&&uno<300)
                    {
amt =3*uno;}
                     else
                    {
                    amt =3.5*uno;
                    }
                            System.out.println("total amount to be paid:"+amt);
                    }
                    }
        
    
   
