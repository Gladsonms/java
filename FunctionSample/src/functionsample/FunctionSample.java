/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsample;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FunctionSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=sum(num1,num2);
        System.out.println("reswult :"+result); 
    }
   static int sum(int a,int b){
        int s=a+b;
        return s;
    }
}
