/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
class Even extends Thread
{
    public void run()
    {
        System.out.println("thread event start");
        for(int i=0;i<=10;i+=2)
        {
            System.out.println("event no:"+i);
        }
        System.out.println("threads even stop\n");
    }
}
class odd extends Thread
{
    public void run()
    {
        System.out.println("Thread add strat:");
        for(int i=1;i<=10;i+=2)
        {
            System.out.println("odd no:"+i);
        }
        System.out.println("thread odd stop");
    }

    }
/**
 *
 * @author student
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Even().start();
        new odd().start();
        // TODO code application logic here
    }
    
}
