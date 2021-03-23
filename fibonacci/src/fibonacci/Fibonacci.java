/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n= Integer.parseInt(scanner.nextLine());
        int a=-1,b=1,c;
        System.out.println("fibonacci series are:");
        for(int i=0;i<n;i++)
        {
            c=a+b;a=b;b=c;
            System.out.println(c);
            
        }
        
        // TODO code application logic here
    }
    
}
