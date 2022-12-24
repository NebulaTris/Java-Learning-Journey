/*Aim:Program to find the volume of a box
Description: Program to find the volume of the box by taking the length, breadth and heigth of the box as input from user*/

//Program
import java.util.Scanner;
public class volBox
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of the box:");
        double l=s.nextDouble();
        System.out.println("Enter the breadth of the box:");
        double b=s.nextDouble();
        System.out.print("Enter the height of the box:");
        double h=s.nextDouble();
        double vol;
        vol=l*b*h;
        System.out.print("The volume of the box is:"+vol);
    }
}
