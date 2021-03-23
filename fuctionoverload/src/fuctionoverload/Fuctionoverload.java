/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuctionoverload;
import java.util.Scanner;
class shape
{
    void volume(double x)
    {
        System.out.println("volume of cube is:"+Math.pow(x,3)+"cube units");
    }
    void volume(double x,double y,double z)
    {
        System.out.println("volume of rectangle box is:"+x*y*z+"cube unit");
    }
    void volume(double x,double y)
    {
        double z=3.14*x*x*y;
        System.out.println("volume of cylinder is:"+z+"cube units");
    }
    }


/**
 *
 * @author student
 */
public class Fuctionoverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        shape ob=new shape();
        double s,l,b,h,r,t;
        System.out.println("......CUBE.....\n enter side of the cube");
        s=in.nextDouble();
        ob.volume(s);
        System.out.println(".....Rectangle box.....");
        System.out.println("enter the length,breadth & height of the rectangle box:");
        l=in.nextDouble();
        b=in.nextDouble();
        h=in.nextDouble();
        ob.volume(l,b,h);
        System.out.println(".........CYLINDER...........");

        System.out.println("enter the radius & height of cylinder:");
r=in.nextDouble();
t=in.nextDouble();
ob.volume(r,t);
    }
   }
    

