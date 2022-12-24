/*Aim:Program to check if the number is a perfect square or not.
Description: The java.lang.Math.sqrt() returns the square root of a value of the type passed to it as argument.*/

//Program:
import java.util.Scanner;
public class PerfSqr
{
    static boolean checkPerfSqr(Double number)
    {
        double sqrt=Math.sqrt(number);
        return((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter any number:");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();
        if (checkPerfSqr(number))
        System.out.print("Yes,the given number is perfect square.");
        else
        System.out.print("No,the given number is not perfect square.");
    }
    }
