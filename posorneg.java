/*Aim:Program to find if the number is Positive or Negative.
Description: Program to check whether the input given by user is positive or negative.*/

//Program:
import java.util.Scanner;
public class PosOrNeg
{
    public static void main(String[] args)
    {
        System.out.print("Enter number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a)>0)
        {
            System.out.println("The number is positive.");
        }
        else if((a)<0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
    }
}
