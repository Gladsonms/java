/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removevowel;
import java.util.*;
import java.io.*;

/**
 *
 * @author HP
 */
public class Removevowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");
        str=in.nextLine();
        str=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str);
    }
    
}
