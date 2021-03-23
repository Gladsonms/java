/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.*;
import java.io.*;

/**
 *
 * @author HP
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String str1,str2;
        int len1,len2;
        System.out.println("Enter the first string : ");
        str1=in.next();
        System.out.println("Enter the second string : ");
        str2=in.next();
        char[]st1=str1.toCharArray();
        char[]st2=str2.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        len1=str1.length();
        len2=str2.length();
        if(len1==len2)
        {
            if(Arrays.equals(st1,st2))
                System.out.println("Strings are anagram");
            else
                System.out.println("Strings are not anagram");
        }
        else
        {
            System.out.println("Different length.....Not anagram");
        }
            
    }
    
}
