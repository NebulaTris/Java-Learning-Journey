/*OBJECTIVE: Write a program that reads in two floating point numbers and tests whether they are same up to three decimal places.

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
package javaapplication13;
import java.util.*;

public class JavaApplication13
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
      System.out.print ("Enter floating number 1: ");
    float x = in.nextFloat ();
      System.out.print ("Enter floating number 2: ");
    float y = in.nextFloat ();
      x = x * 1000;
    int p = (int) x;
      y = y * 1000;
    int q = (int) y;
    if (p == q)
      {
	System.out.println ("Same up to three decimal places");
      }
    else
      {
	System.out.println ("Different");
      }
  }
}
