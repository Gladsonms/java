/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdifferenceproduct;
import java.io.*;
import java.util.*;
/**
 *
 * @author HP
 */


public class SumDifferenceProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the values of a and b : ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("SUM : "+(a+b));
        System.out.println("DIFFERENCE : "+(a-b));
        System.out.println("PRODUCT : "+(a*b));
        System.out.println("QUOTIENT : "+(a/b));
        System.out.println("REMAINDER : "+(a%b));
        
    }
    
}
