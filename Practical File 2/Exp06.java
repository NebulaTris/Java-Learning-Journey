/*OBJECTIVE: Handle different types of exceptions
a)	Arithmetic Exception
b)	Array Index Out of Bounds
c)	Null Pointer
d)	Multiple catch block
e)	Use of throws keyword.
f)	Use of finally block.

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
//a)
package javaapplication20;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class JavaApplication20
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter Dividend:");
    int b = sc.nextInt ();
      System.out.print ("Enter Divisor:");
    int a = sc.nextInt ();
    int c;
      try
    {
      c = b / a;
      System.out.println (">>>>>>>Try Block<<<<<<<<<");
      System.out.println ("Quotient is" + c);
    }
    catch (ArithmeticException e)
    {
      System.out.println ("Division by Zero");
      System.out.println ("Exception Caught in Catch Block");
    }
  }
}

//b)
package arrayoutofbounds;
import java.util.*;
public class Arrayoutofbounds
{
  public static void main (String[]args)
  {
    int n;
    Scanner sc = new Scanner (System.in);

    int[] array = new int[5];
      try
    {
      System.out.print ("Enter the number of elements you want to store: ");
      n = sc.nextInt ();
      System.out.println ("Enter the elements of the array: ");
      for (int i = 0; i < n; i++)
	{
	  array[i] = sc.nextInt ();
	}
    }
    catch (Exception e)
    {
      System.out.println ("\nException caught" + e);
    }
  }
}

//c)
package javaapplication14;
class M
{
  static void demoproc ()
  {
    try
    {
      throw new NullPointerException ("demo");
    }
    catch (NullPointerException e)
    {
      System.out.println ("Caught an Exception inside first catch block");
      throw e;
    }

  }
}

public class JavaApplication14
{
  public static void main (String[]args)
  {
    M m = new M ();
      try
    {
      m.demoproc ();
    }
    catch (NullPointerException e)
    {
      System.out.println ("Recaught:" + e);
    }
  }
}

//d)
package javaapplication14;
class M
{
  static void demoproc ()
  {
    try
    {
      throw new NullPointerException ("demo");
    }
    catch (NullPointerException e)
    {
      System.out.println ("Caught an Exception inside first catch block");
      throw e;
    }
  }
}

public class JavaApplication14
{
  public static void main (String[]args)
  {
    M m = new M ();
      try
    {
      m.demoproc ();
    }
    catch (NullPointerException e)
    {
      System.out.println ("Recaught:" + e);
    }
  }
}

//e)
class Test
{
  static void fun () throws IllegalAccessException
  {
    System.out.println ("Inside the function");
    throw new IllegalAccessException ("Illegal Exception");
  }
  public static void main (String args[])
  {

    try
    {

    }



    fun ();

    catch (IllegalAccessException e)
    {

      System.out.println (e);
    }
  }
}

//f)
import java.io.*;
class M
{
  public static void main (String[]args)
  {
    try
    {
      System.out.println ("Inside try

block");
      System.out.println (34 / 0);

    }
    catch (NullPointerException e)
    {
      System.out.println ("catch : exception not handled.");
    }
    finally
    {
      System.out.println ("finally : i will execute always.");
    }
    System.out.println ("i want to run");
  }
}
