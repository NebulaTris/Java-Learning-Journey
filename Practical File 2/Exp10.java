/*Aim: WAP to implement a runnable interface*/

import java.lang.Exception;
class X implements Runnable
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println("\tThread X : " +i);
    }
    System.out.println("End of Thread X");
  }
}
 class Y implements Runnable
 {
    public void run()
    {
      for(int j=1;j<=10;j++)
      {
        System.out.println("\t Thread  Y:" +j);
      }
      System.out.println("End of Thread Y");
   }
}
class Z implements Runnable
{
  public void run()
  {
    for(int k=1;k<=10;k++)
    {
      System.out.println("\tThread Z : " +k);
    }
    System.out.println("End of Thread Z");
  }
}
class RunnableTest
{
  public static void main(String args[])
  {
    X runnable = new X();
    Thread threadX = new Thread(runnable);
    Y runnable1 = new Y();
    Thread threadY = new Thread(runnable1);
    Z runnable2 = new Z();
    Thread threadZ = new Thread(runnable2);
    threadX.start();
    threadY.start();
    threadZ.start();
    
    System.out.println("End of main thread");
  }
}
