/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexsum;
import java.util.Scanner;
class complex
{
    int real,imag;
    Scanner in=new Scanner(System.in);
    complex(){
}
    void accept()
    {
        System.out.println("enter the real part:");
        real=in.nextInt();
        System.out.println("enter the imaginary part:");
        imag=in.nextInt();
    }
void display()
{
    System.out.println("("+real+")+("+imag+")i");
    
}
}

public class Complexsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("...........complex number1............");
        complex c1=new complex();
        c1.accept();
        System.out.println(".........complex number2.........");
        complex c2=new complex();
        c2.accept();
        System.out.println("sum of the complex number:");
        c1.display();
        c2.display();
        System.out.println("----------");
        complex c3=new complex();
        c3.real=(int) c1.real+c2.real;
        c3.imag=(int) c1.imag+c2.imag;
        c3.display();
        // TODO code application logic here
    }
    
}
