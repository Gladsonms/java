/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcflcm;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class HCFLCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,x,y,t,hcf,lcm;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number : ");
        x=in.nextInt();
        y=in.nextInt();
        a=x;
        b=y;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;   
        }
        hcf=a;
        lcm=(x*y)/hcf;
        System.out.println("HCF : "+hcf);
        System.out.println("\nLCM : "+lcm);
        
    }
    
}
