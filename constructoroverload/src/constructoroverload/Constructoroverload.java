/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverload;
class area
{
    area(){
        
    }
    area(double x)
    {
        System.out.println("area of square="+(x*x));
    }
    area(double y,double z)
    {
        System.out.println("area of rectangle="+(y*z));
    }
}

public class Constructoroverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        area ob1=new area(5);
        area ob2=new area(12,3);
    }
        // TODO code application logic here
    }
    

