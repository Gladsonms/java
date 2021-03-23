/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgthis;

/**
 *
 * @author student
 */
public class Pkgthis {
    private int x,y;
    public void setvar(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println(x+"  "+y);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Pkgthis obj= new Pkgthis();
       obj.setvar(10, 20);
        System.out.println(obj.x+"  "+obj.y);
        // TODO code application logic here
    }
    
}
