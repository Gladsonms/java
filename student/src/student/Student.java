/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
class studentdetails
{
String name;
int rno;
void read()
{
System.out.println("enter the name of students:");
Scanner scan=new Scanner(System.in);
name=scan.nextLine();
System.out.println("enter the rollno:");
rno=scan.nextInt();
}
void display()
{
System.out.println("students details\n*********");
System.out.println("name:"+name+"\n"+"rollno:"+rno);
}
}
class Result extends studentdetails
{
int[]marks=new int[5];
int total,per;
char grade;
Result()
{
total=0;
}
void readmark()
{
System.out.println("enter the marks for 5 subjects(out of 100)");
Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++)
{
marks[i]=scan.nextInt();
total+=marks[i];
}
per=total/5;
if(per>=90)grade='A';
else if(per>=80)grade='B';
else if(per>=70)grade='C';
else if(per>=60)grade='D';
else if(per>=50)grade='E';
else if(per>=40)grade='F';
else System.out.println("Invalid marks!");
}
void disp()
{
System.out.println("total mark:"+total);
System.out.println("grade:"+grade);
}
}


public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result r1=new Result();
        r1.read();
        r1.readmark();
        r1.display();
        r1.disp();
        
    }
        // TODO code application logic here
    }
    
