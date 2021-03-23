/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwexample;
class throwclass
        {
    void div(int x,int y)
    {
        int p;
        try {
            if(y==0)
                throw new ArithmeticException("error:division by zero!!");
            else
                p=x/y;
            
        } catch (Exception e) {
            System.out.println(e);
           
        }
      } 
       
        }

public class Throwexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       throwclass obj= new throwclass();
        obj.div(10,0);
        System.out.println("reset of the code......");
        // TODO code application logic here
    }
}
