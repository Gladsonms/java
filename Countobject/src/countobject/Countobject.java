/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countobject;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Countobject {
static int count=0;
Countobject()
{
    count++;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Countobject obj1=new Countobject();
        Countobject obj2=new Countobject();
        Countobject obj3=new Countobject();
        System.out.println("Number of objects created : "+count);
    }
    
}
