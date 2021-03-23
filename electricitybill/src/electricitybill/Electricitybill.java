/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybill;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Electricitybill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        double cno,uno,amt;
        System.out.println("enter the number of consumer:");
        cno =in.nextInt();
         System.out.println("enter the number of units consumer:");
        uno=in.nextInt();
        if(uno<50)
        {
            amt=1.5*uno;}
        else if(uno>50&&uno<100)
        {
            amt=2*uno;}
        else if(uno>100&&uno<200)
        {amt=2.8*uno;}
        else if(uno>200&&uno<300)
        {
            amt=3*uno;}
        else
        {amt=3.5*uno;}
        System.out.println("total amount to be paid:"+amt);
        }        
        
    }
    

