/*OBJECTIVE: Distance travelled by a vehicle in t seconds is ut + ½*(a*t^2).
Write a program to calculate the distance travelled by a vehicle at regular intervals of time given the values of acceleration and u. 
The program should provide the flexibility to the user to select their own time intervals and repeat calculations for different values of a and u

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
package javaapplication9;
import java.util.Scanner;
public class JavaApplication9
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    double s;
      System.out.print ("Enter the number of intervals=");
    int n = sc.nextInt ();
    for (int i = 1; i <= n; i++)
      {
	System.out.print ("Enter the initial distance in metres=");
	float u = sc.nextFloat ();
	  System.out.print ("Enter the time in seconds=");
	float t = sc.nextFloat ();
	  System.out.print ("Enter the acceleration in m/s^2=");
	float a = sc.nextFloat ();
	  s = u * t + ((1 / 2) * a * t * t);
	  System.out.println ("The total distance travelled=" + s);
      }
  }
}

