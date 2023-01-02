/*Aim:Write the incorrect version of Producer Consumer Problem
Description: Producer and Consumer are two separate processes.Both processes share a common buffer or queue.The producer continuously produces certain data and pushes it onto the buffer,whereas the consumer consumes those data from the buffer.*/

//Program:
package ProducerConsumer;
class Q{
  int n;
  synchronized int get(){
    System.out.println("Got"+n);
    return n;
  }
  synchronized void put(int n){
    this.n=n;
    System.out.println("Put"+n);
  }
}
class Producer implements Runnable{
  Q q;
  Producer (Q q){
    this.q=q;
    new Thread(this, "Producer").start();
  }
  public void run(){
    int i=0;
    while(true){
      q.put(i++);
    }
  }
}
class Consumer implements Runnable{
  Q q;
  Consumer(Q q){
    this.q=q;
    new Thread(this, "Consumer").start();
  }
  public void run(){
    while(true){
      q.get();
    }
  }
}
public class ProducerConsumerIncorrect{
  public static void main(String[] args){
    Q q=new Q();
    new Producer(q);
    new Consumer(q);
    System.out.println("Press CTRL+F2 to stop!");
  }
}
