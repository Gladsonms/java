/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconversion;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Baseconversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int num,rem,base;
        String str=" ";
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.println("Enter the number : ");
        num=in.nextInt();
        System.out.println("Enter the base to convert : ");
        base=in.nextInt();
        while(num>0)
        {
            rem=num%base;
            str=dig[rem]+str;
            num=num/base;
        }
        System.out.println(str);
    }
    
}
