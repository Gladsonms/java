/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abundant;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Abundant {

    /**
     * @param args the command line arguments
     */
    public int num=0;
    public void getnum()
            
    
   {
       Scanner in= new Scanner(System.in);
       System.out.println("enter a number:");
       num=in.nextInt();
   }
    public void fnabundant()
    {
        int sum=0,dnum=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)sum=sum+i;}
        dnum=2*num;
        if(sum<dnum)
            System.out.println("it is a deficent number!:");
        else if(sum==dnum)
            System.out.println("it is a perfect number!");
        else if(sum>dnum)
            System.out.println("it is adundant number!");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Abundant ob= new Abundant();
        ob.getnum();
        ob.fnabundant();
        
        
    }
    
}
