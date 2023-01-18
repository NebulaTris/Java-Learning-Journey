//Program 1
package javaapplication9;
import java.util.Scanner;
public class JavaApplication9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=0;
        for(int i=1; i<=4;i++)           
       {
           for (int j=1; j<=i;j++)
           {
               System.out.print(++k+" ");
           }
           System.out.println();
       }
    }
    
}


//Program 2
package javaapplication9;
import java.util.Scanner;
public class JavaApplication9 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double s;
       System.out.print("Enter the number of intervals=");
       int n= sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           System.out.print("Enter the initial distance in metres=");
           float u= sc.nextFloat();
           System.out.print("Enter the time in seconds=");
           float t= sc.nextFloat();
           System.out.print("Enter the acceleration in m/s^2=");
           float a= sc.nextFloat();
           s=u*t+((1/2)*a*t*t);
            System.out.println("The total distance travelled=" +s);
       }
       
    }
    }
