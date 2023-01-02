/* Aim:Program to find Sum of First N Natural Numbers.
Description: Program to find the sum of the first n natural numbers using "for" loop.*/

//Program
import java.util.Scanner;
public class SumNat
{
    public static void main(String[] args)
    {
        System.out.print("Enter Number till which the sum is to be calculated:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        for (i=1;i<=(n);++i)
        {
            sum+=i;
        }
        System.out.println("Sum of First "+n+" Natural Numbers is = " + sum);
    }
}
