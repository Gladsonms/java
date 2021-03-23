/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergetwoarray;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Mergetwoarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int m,n,i,j,k=0;
        int a1[]=new int[10];
        int a2[]=new int[10];
        int a3[]=new int[20];
        System.out.println("Enter the size of array 1 :");
        m=in.nextInt();
        System.out.println("Enter the elements : ");
        for(i=0;i<m;i++)
        {
            a1[i]=in.nextInt();
        }
        System.out.println("Enter the size of array 2 : "); 
        n=in.nextInt();
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++)
        {
            a2[i]=in.nextInt();
        }
        i=0;
        j=0;
        k=0;
        while(i<m&&j<n)
        {
            if(a1[i]<a2[j])
            {
                a3[k]=a1[i];
                i++;
            }
            else
            {
                a3[k]=a2[j];
                j++;
            }
            k++;
        }
        
        if(i>=m)
        {
            while(j<n)
            {
                a3[k]=a2[j];
                j++;
                k++;
            }
                
        }
        
        if(j>=n)
        {
            while(i<m)
            {
                a3[k]=a1[i];
                i++;
                k++;
            }
        }
        System.out.println("After merging : ");
        for(i=0;i<m+n;i++)
        {
            System.out.println(a3[i]);
        }
    }
    
}
