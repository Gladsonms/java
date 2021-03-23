/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        double cm,inch,mtr,km;
        System.out.println("Enter the centimeter value : ");
        cm=in.nextDouble();
        inch=0.3937*cm;
        mtr=0.01*cm;
        km=0.00001*cm;
        System.out.println(cm +"cm is equal to " +inch +" inches");
        System.out.println(cm +"cm is equal to " +mtr +" mtr");
        System.out.println(cm +"cm is equal to " +km +" km");
        
    }
    
}
