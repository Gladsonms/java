/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;
class Super
{
int x,y;
Super(int x,int y)
{
    this.x=x;
    this.y=y;
}
void greatest()
{
    if(x>y)
        System.out.println(x+"is a greatest");
    else
        System.out.println(y+"is greatest");
    }
}
class sub extends Super
{
    int z;
    sub(int x,int y,int z)
    {
        super(x,y);
        this.z=z;
    }
    void greatest()
    {
        if(x>y&&x>z)
            System.out.println(x+"is greatest");
        else if(y>z&&y>x)
            System.out.println(y+"is greatest");
        else
            System.out.println(z+"is greatest");
    
                
    }
}
/**
 *
 * @author student
 */
public class Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sub s1=new sub(6,3,4);
        s1.greatest();
        // TODO code application logic here
    }
    
}
