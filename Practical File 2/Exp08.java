/*OBJECTIVE: The daily maximum temperatures recorded in 2 cities during a week have been tabulated. Write a program to read the table elements into a two-dimensional array temperature, and to find the city and day corresponding to
(a)	the highest temperature and
(b)	the lowest temperature.

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
package javaapplication12;
import java.util.*;
public class JavaApplication12
{
  public static void main (String[]args)
  {
    int i, j;
    float temp[][] = new float[2][7];
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the temperature of 2 cities in one week");
    for (i = 0; i < 2; i++)
      {
	for (j = 0; j < 7; j++)
	  {
	    System.out.print ("Enter temperature of City " + (i + 1) +
			      " for Day " + (j + 1) + ": ");
	    temp[i][j] = sc.nextFloat ();
	  }
      }
    int p = 0, q = 0, x = 0, y = 0;
    for (i = 0; i < 2; i++)
      {
	for (j = 0; j < 7; j++)
	  {
	    if (temp[i][j] > temp[p][q])
	      {
		p = i;
		q = j;
	      }
	    if (temp[i][j] < temp[x][y])
	      {

		x = i;
		y = j;
	      }
	  }
      }
    System.out.println ("Highest Temperature:" + temp[p][q]);
    System.out.println ("Lowest Temperature:" + temp[x][y]);
    System.out.println ("City " + (p + 1) + " Day " + (q + 1) +
			" is the hottest day");
    System.out.println ("City " + (x + 1) + " Day " + (y + 1) +
			" is the coldest day");
  }
}
