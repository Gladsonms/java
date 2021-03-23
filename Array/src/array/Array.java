/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n,i,j,temp;
        int a[]=new int[10];
        System.out.println("Enter the array limit : ");
        n=in.nextInt();
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Smallest element : "+a[0] +"\nLargest element : "+a[n-1] +"\nSecond largest element : "+a[n-2]);
    
}
}
