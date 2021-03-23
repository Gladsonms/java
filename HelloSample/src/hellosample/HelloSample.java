/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellosample;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HelloSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s= new Scanner(System.in);
        System.out.println("Enter two numbers:  ");
       int a=s.nextInt();
       int b=s.nextInt();
       int c=a+b;
       System.out.println("sum of value " +c);
       
        
    }
    
}
