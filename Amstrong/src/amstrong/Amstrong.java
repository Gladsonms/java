/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amstrong;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Amstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int l,h,i,rem,sum,num;
        System.out.println("Enter the lower limit and upper limit : ");
        l=in.nextInt();
        h=in.nextInt();
        System.out.println("Amstrong numbers : ");
        for(i=1;i<=h;i++)
        {
            num=i;
            sum=0;
            while(num!=0)
            {
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if(sum==i)
                System.out.println(i);
        }
    }
    
}
