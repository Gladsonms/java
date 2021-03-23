/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceandtranspose;

import java.util.*;
import java.io.*;

/**
 *
 * @author HP
 */
public class Traceandtranspose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n,m,i,j,trace=0;
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        System.out.println("Enter the values of m and n : ");
        m=in.nextInt();
        n=in.nextInt();
        System.out.println("Enter the elements : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[j][i]=a[i][j];
                if(i==j)
                {
                    trace=trace+a[i][j];
                }
            }
        }
        System.out.println("TRACE : "+trace);
        System.out.println("TRANSPOSE : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(b[i][j]);
            }
            System.err.println(" ");
        }
    }
    
}
