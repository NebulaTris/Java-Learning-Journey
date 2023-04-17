
/*OBJECTIVE: An election is contested by 5 candidates the candidates are numbered 1-5 and voting is done by marking the candidate number on ballet paper.
Write a program to read ballets and count the votes cast for each candidate using an array variable count in case a number is outside the range 1-5 the ballet should be considered as spoilt ballet and program should also count the number of spoilt ballots.

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
package javaapplication8;
import java.util.Scanner;

public class JavaApplication8
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n, ch, one = 0, two = 0, three = 0, four = 0, five = 0, x = 0;

      System.out.println ("Enter total number of voters: ");
      n = sc.nextInt ();

    for (int i = 0; i < n; i++)
      {
	System.out.println ("\nEnter votes for:");
	System.out.println ("1 2 3 4 5");
	System.out.println ("\nYour vote goes to: ");
	ch = sc.nextInt ();

	switch (ch)
	  {
	  case 1:
	    one++;
	    break;
	    case 2:two++;
	    break;
	    case 3:three++;
	    break;
	    case 4:four++;
	    break;
	    case 5:five++;
	    break;
	    default:x++;
	    break;
	  }
      }

    System.out.println ("\n Votes given to person 1 is: " + one);
    System.out.println ("\n Votes given to person 2 is: " + two);
    System.out.println ("\n Votes given to person 3 is: " + three);
    System.out.println ("\n Votes given to person 4 is: " + four);
    System.out.println ("\n Spoilt votes are: " + x);
    sc.close ();
  }
}
