/*Aim:Program to Display Odd Numbers from 1 to 100.
Description: Program to display the odd number from 1 to 100 using "for" loop.*/

//Program:
public class OddNUm
{
    public static void main(String args[])
    {
        int num=100;
        System.out.print("List of odd numbers from 1 to "+num+":");
        for (int i=1;i<=num;i++)
        {
            if (i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
