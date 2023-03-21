//Aim:Write a program in Java to display the cube of the number upto given an integer.

//Code:
import java.util.Scanner;
public class cube {

   public static void main(String[] args)

{
    int i,n;
    System.out.print("Input number of terms : ");
    Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();
     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}
