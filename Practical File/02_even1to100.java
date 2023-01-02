/* Aim: Program to Display Even Numbers from 1 to 100
Description: Program that displays even number from 1 to 100 using "for" loop */

//Program
public class EvenNum
{
    public static void main(String args[])
    {
        int num=100;
        System.out.print("List of even numbers from 1 to "+num+":");
        for (int i=1;i<=num;i++)
        {
            if (i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
