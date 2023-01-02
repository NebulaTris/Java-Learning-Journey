/*Aim: Write a threaded program by implementing a runnable interface.
Description: Runnable Interface-The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.Runnable interface have only one method named run().
public void run():is used to perform action for a thread.*/

//Program:

//Main.java
package Pack3;
import java.lang.Thread;

class Qwerty implements Runnable{
  int i;
  Thread top;
  Qwerty() {
    top=new Thread(this, "TOP");
    top.start();
  }
  public void run() {
    try {
      for (i=5; i<10;i++) {
        Thread.sleep(1000);
        Thread top= Thread.currentThread();
        String name= top.getName();
        System.out.println("The Thread named:-" +name+" gives the value:- "+i);
      }
    }
    catch(IllegalThreadStateException e){
      System.out.println("Interrupted"+e);
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}
public class Main{
  public static void main(String[] args){
    int n1=0,n2=1,n3,i,count=10;
    Qwerty obj=new Qwerty();
    try{
      for (i=2;i<count;++i)
      {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        Thread top=Thread.currentThread();
        String name=top.getName();
        Thread.sleep(90);
        System.out.println("The thread named:-"+name+"gives the fibonacci value:-"+n3);
      }
    }catch (IllegalThreadStateException | InterruptedException e){
      System.out.println("Main interrupted"+e);
    }
    System.out.println("is run() method isAlive"+Thread.currentThread().isAlive());
  }
}

//ReverseNumber.java
package Pack3;
import java.util.*;
public class ReverseNumber{
  public static void main(String[] args) {
    int r=0;
    System.out.println("Enter a Number:");
    Scanner myObj=new Scanner(System.in);
    int inp=myObj.nextInt();
    while(inp!=0){
      int num=inp%10;
      r=r*10+num;
      inp/=10;
    }
    System.out.println("Reverse number is:-"+r);
  }
}

//Object.java

package Pack3;

public class Object {
  public void main(String[] args){
    Main obj=new Main();
  }
}
    
