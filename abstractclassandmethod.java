/*Aim:Program to demonstrate concept of abstract classes and abstract method.
Description: Abstract class-A class which is declared as abstract is known as an abstract class.It can have abstract and non abstract methods.*/

//Program:
import java.util.*;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Test{
    public static void main(String[] args){
        System.out.println("Enter the number of sides of the shape: ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        Shape s1;
        if (s==0){s1=new Circle();s1.draw();}
        else if (s==4){s1=new Rectangle();s1.draw();}
        else if (s!=0&&s!=4){System.out.println("Unknown to Creator");System.exit(0);}
    }
}
