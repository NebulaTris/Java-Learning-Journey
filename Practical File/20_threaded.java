/*Aim: Write a threaded program by extending the thread class.
Description: Thread-A thread is a lightweight sub-process, the smallest unit of processing.Thread class provide constructors and methods to create and perform operations on a thread.Thread clas extends object class and implements runnable interface.*/

//Program:
package Threads;
public class ExtendingThread extends Thread{
  public void run()
  {
    try {
      System.out.println("Thread" + Thread.currentThread().getId()+" is running");
    }
    catch (Exception e) {
      System.out.println("Exception is caught");
    }
  }
}
class Thread1{
  public static void main(String[] args)
  {
    ExtendingThread obj1= new ExtendingThread();
    obj1.start();
    ExtendingThread obj2= new ExtendingThread();
    obj2.start();
    ExtendingThread obj3= new ExtendingThread();
    obj3.start();
  }
}
