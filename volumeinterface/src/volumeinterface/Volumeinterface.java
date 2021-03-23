/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumeinterface;

import java.io.*;
import java.util.*;
/**
 *
 * @author HP
 */

interface volume
{
static final double pi=3.14;
public abstract void readdata();
public abstract void dispvolume();
}

class sphere implements volume
{
Scanner in=new Scanner(System.in);
double r,vol;
public void readdata()
{
System.out.println("ENTER THE RADIUS SPHERE:");
r=in.nextDouble();
}
public void dispvolume()
{
vol=(4/3)*pi*r*r*r;
System.out.println("VOLUME OF SPHERE:"+vol);
}
}
class cylinder implements volume
{
Scanner in=new Scanner(System.in);
double r,vol,h;
public void readdata()
{
System.out.println("ENTER THE RADIUS OF CYLINDER:");
r=in.nextDouble();
System.out.println("ENTER THE HEIGHT OF CYLINDER:");
h=in.nextDouble();
}
public void dispvolume()
{
vol=pi*r*r*h;
System.out.println("VOLUME OF CYLINDER:"+vol);
}
}

public class Volumeinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cylinder cyl=new cylinder();
        sphere sp=new sphere();
        cyl.readdata();
        cyl.dispvolume();
        sp.readdata();
        sp.dispvolume();
    }
    
}
