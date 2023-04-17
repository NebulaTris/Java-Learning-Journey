/*OBJECTIVE: Write a program to display the uses of priority in threads.

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
package javaapplication22;
import java.lang.Exception;

class A extends Thread
{
  public void run ()
  {
    System.out.println ("Thread A started");
    for (int i = 1; i <= 4; i++)
      {
	System.out.println ("\tFrom Thread a : i = " + i);
      }
    System.out.println ("Exit from A");
  }
}

class B extends Thread
{
  public void run ()
  {
    System.out.println ("Thread B started");
    for (int j = 1; j <= 4; j++)
      {
	System.out.println ("\tFrom Thread b : j = " + j);
      }
    System.out.println ("Exit from B");
  }
}

class C extends Thread
{
  public void run ()
  {
    System.out.println ("Thread C started");
    for (int k = 1; k <= 4; k++)
      {
	System.out.println ("\tFrom Thread c : k = " + k);

      }
    System.out.println ("Exit from C");
  }
}

public class JavaApplication22
{
  public static void main (String args[])
  {
    A threadA = new A ();
    B threadB = new B ();
    C threadC = new C ();

      threadC.setPriority (Thread.MAX_PRIORITY);
      threadB.setPriority (threadA.getPriority () + 1);
      threadA.setPriority (Thread.MIN_PRIORITY);

      System.out.println ("Start thread A");
      threadA.start ();

      System.out.println ("Start thread B");
      threadB.start ();

      System.out.println ("Start thread C");
      threadC.start ();

      System.out.println ("End of the main thread");
  }
}
