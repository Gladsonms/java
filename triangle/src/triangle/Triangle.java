/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int x,y,z,s,area;
    Scanner in= new Scanner(System.in);
System.out.println("enter the three sides of triangle:");
    x= in.nextInt();
    y =in.nextInt();
    z =in.nextInt();
    if((x+y>z)&&(y+z>x)&&(z+x>y))
    {
        System.out.println("can form a triangle!");}
        if((x==y)&&(y==z))
        {
            System.out.println("equilateral triangle!");}
            else if((x==y)||(y==z)||(x==z))
            {
                System.out.println("isosceles triangle!");
            }
    else
            {
                System.out.println("scalence triangle!");
                s=(x+y+z)/2;
             area=s*(s-x)*(s-y)*(s-z);
                System.out.println("area of triangle:"+area);
               
                
    }
        // TODO code application logic here
    }
}
