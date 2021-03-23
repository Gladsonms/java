/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseandsum;
import java.util.Scanner;
class Number
{
    void sum(int x)
    {
        int d,s=0;
        while(x>0)
        {
            d=x%10;
            s=s+d;
            x=x/10;
            
        }
        System.out.println("sum of the digits:"+s);
    }
            void rev(int x)
            {
                int r,rev=0;
                while(x>0)
                {
                    r=x%10;
                    rev=((rev*10)+r);
                    x=x/10;
                }
                System.out.println("Reverse of digits="+rev);
                    
                }
}

/**
 *
 * @author student
 */
public class Reverseandsum
{
 
   public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Number num=new Number();
        System.out.println("enter the number:");
        int n=Integer.parseInt(in.nextLine());
        num.sum(n);
        num.rev(n);
    }
}