/*OBJECTIVE: Multithreaded Programs
a) Write a program to control the main thread.
b) Write a program to create multiple threads.

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
//a)
package multithread;
class Multithread
{
  public static void main (String args[])
  {
    Thread t = Thread.currentThread ();
      System.out.println ("Current thread: " + t);
      t.setName ("My Thread");
      System.out.println ("After name change: " + t);
      try
    {
      for (int n = 5; n > 0; n--)
	{
	  System.out.println (n);
	  Thread.sleep (10000);
	}
    }
    catch (InterruptedException e)
    {
      System.out.println ("Main thread interrupted");
    }
  }
} package multithread;

class Multithread
{
  public static void main (String args[])
  {
    Thread t = Thread.currentThread ();
      System.out.println ("Current thread: " + t);
      t.setName ("My Thread");
      System.out.println ("After name change: " + t);
      try
    {
      for (int n = 5; n > 0; n--)
	{
	  System.out.println (n);
	  Thread.sleep (10000);
	}
    }
    catch (InterruptedException e)
    {
      System.out.println ("Main thread interrupted");
    }
  }
}

//b)
package threaddemo;
class NewThread implements Runnable
{
  String name;
  Thread t;
    NewThread (String threadname)
  {
    name = threadname;
    t = new Thread (this, name);
    System.out.println ("New thread: " + t);
    t.start ();
  }
  public void run ()
  {
    try
    {
      for (int i = 5; i > 0; i--)
	{
	  System.out.println (name + ": " + i);
	  Thread.sleep (1000);
	}
    }
    catch (InterruptedException e)
    {
      System.out.println (name + "Interrupted");
    }
    System.out.println (name + " exiting.");
  }
}

class ThreadDemo
{
  public static void main (String args[])
  {
    new NewThread ("One");
    new NewThread ("Two");
    new NewThread ("Three");
      try
    {
      Thread.sleep (10000);
    }
    catch (InterruptedException e)
    {
      System.out.println ("Main thread Interrupted");
    }
    System.out.println ("Main thread exiting.");
  }
}
