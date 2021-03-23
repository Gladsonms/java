/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglearea;
import java.util.Scanner;
class Rectangle
{
    Scanner in=new Scanner(System.in);
    double length,breadth;
    Rectangle()
    {
        System.out.println("enter the length:");
        length=in.nextInt();
        System.out.println("enter the breadth:");
        breadth=in.nextInt();
        
       }
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    double getArea()
    {
        return length*breadth;
    }
}


/**
 *
 * @author student
 */
public class Rectanglearea {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area1,area2;
        System.out.println(".........Rectangle1..........");
        Rectangle rec1=new Rectangle();
        System.out.println("length="+rec1.length+"breadth="+rec1.breadth);
        area1=rec1.getArea();
        System.out.println("area of rectangle1"+area1);
        System.out.println("..........Reactangle2........");
        Rectangle rec2=new Rectangle();
        System.out.println("length="+rec2.length+"breadth="+rec2.breadth);
        area2=rec2.getArea();
        System.out.println("area of triangle="+area2);
        if(area1>area2)
        {
            System.out.println(""+area1+">"+area2+"area of triangle 1 is greater!");
        }
        else if(area1<area2)
        {
            System.out.println(""+area1+"<"+area2+"area of reactangle 2 is greatest!");
        }
        else
        {
            System.out.println(""+area1+""+area2+"area of both rectangle are equal!");
        }
    }}

        
