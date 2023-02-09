/*Date:09-02-2023*/
package javaapplication8;
import java.util.*;

class student{
    int rollno;
    public void putno(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll No.:");
        rollno= sc.nextInt();
    }
    public void getno(){
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
        System.out.println("The roll number is:" +rollno);
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
    }
}
class test extends student{
    int m;
    int n;
    public void putmarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of Mathematics:");
        m =sc.nextInt();
        System.out.println("Enter Marks of Science:");
        n =sc.nextInt();
    }
    public void getmarks(){
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
        System.out.println("Marks of Mathematics are:" +m);
        System.out.println("Marks of Science are:" +n);
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
    }
}
interface sports{
    static final int sportwt =6;
    public void putwt();
}
class result extends test implements sports
{
   
    public void putwt()
    {
        System.out.println("The Sport Weight is:"+sportwt);
    }
    public void display()
    {
        int total= m+n+sportwt;
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
        System.out.println("Total Marks are="+total);
    }    
}
public class JavaApplication8 {
    public static void main(String[] args) {
        result r=new result();
        r.putno();
        r.getno();
        r.putmarks();
        r.getmarks();
        r.putwt();
        r.display();
    }    
}
