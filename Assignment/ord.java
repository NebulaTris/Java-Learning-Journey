/*Aim:Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.*/

//Code:
import java.util.Scanner;
public class ord{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        double x = sc.nextDouble();
        System.out.print("Input second number: ");
        double y = sc.nextDouble();
       System.out.print("Input third number: ");
        double z = sc.nextDouble();
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
