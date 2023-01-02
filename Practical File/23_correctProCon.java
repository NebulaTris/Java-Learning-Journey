/*Aim:Write the corrected version of Producer Consumer Problem
Description: Producer and Consumer are two separate processes.Both processes share a common buffer or queue.The producer continuously produces certain data and pushes it onto the buffer,whereas the consumer consumes those data from the buffer.*/

//Program:
package ProducerConsumer;
class Q1{
  int n;
  boolean valueSet=false;
  synchronized int get(){
    while(!valueSet)
      try{
        wait();
      }catch (InterruptedException e){
        System.out.println("Interrupted Exception Found");
      }
    System.out.println("Got"+n);
    valueSet=false;
    notify();
    return n;
  }
  synchronized void put(int n){
    while(valueSet)
      try{
        wait();
      }catch (InterruptedException e){
        System.out.println("Interrupted Exception Found");
      }
    this.n=n;
    System.out.println("Put"+n);
    valueSet=true;
    notify();
  }
}
class Producer1 implements Runnable{
  Q1 r;
  Producer1(Q1 r){
    this.r=r;
    new Thread(this, "Producer").start();
  }
  public void run(){
    int i=0;
    while(true){
      r.put(i++);
    }
  }
}
class Consumer1 implements Runnable{
  Q1 r;
  Consumer1(Q1 r){
    this.r=r;
    new Thread(this, "Consumer").start();
  }
  public void run(){
    while(true){
      r.get();
    }
  }
}
public class ProducerConsumerIncorrect{
  public static void main(String[] args){
    Q1 r=new Q1();
    new Producer1(r);
    new Consumer1(r);
    System.out.println("Press CTRL+F2 to stop!");
  }
}
