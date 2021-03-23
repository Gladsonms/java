/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancetwopoints;
import java.io.*;
import java.util.*;
/**
 *
 * @author HP
 */
public class DistanceTwopoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int x1,y1,x2,y2;
        double dis;
        System.out.println("Enter the coordinates of first point : ");
        x1=in.nextInt();
        y1=in.nextInt();
        System.out.println("Enter the coordinates of second point : ");
        x2=in.nextInt();
        y2=in.nextInt();
        dis=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Distance between two points : "+dis);
        
    }
    
}
