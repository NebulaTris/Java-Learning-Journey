/*Aim:Program to find the smallest of the three numbers.
Description: Program that takes input from user and displays the smallest number*/
//Program:

import java.util.Scanner;
public class SmallestNum
{
    public static void main(String[] args)
    {
        int a,b,c,sm,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        System.out.println("Enter the third number:");
        c=sc.nextInt();
        temp=a<b?a:b;
        sm=c<temp?c:temp;
        System.out.println("The smallest number is: "+sm);
    }
}
