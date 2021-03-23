/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirclesphere;
import java.util.Scanner;
interface Area
{
    final static float pi=3.14F;
    double compute(float r);
}
class circle implements Area
       {
    public double compute(float r)
    {
        return(pi*r*r);
        
    }
}
class spehere implements Area
{
    public double compute(float r)
    {
        return(4*pi*r*r);
        
    }
}

/**
 *
 * @author student
 */
public class Areacirclesphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float r;
        circle cir=new circle();
        spehere sph=new spehere();
        Scanner scan=new Scanner(System.in);
        Area area;
        area=cir;
        System.out.println("enter the radius:");
        r=scan.nextFloat();
        System.out.println("area of circle:"+area.compute(r));
        area=sph;
        System.out.println("area of spehere:"+area.compute(r));
        
        // TODO code application logic here
    }
    
}
