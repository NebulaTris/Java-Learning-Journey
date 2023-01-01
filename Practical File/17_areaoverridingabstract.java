/*Aim:We have to calculate the area the of a rectangle, a square and a circle.Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.Now create another class 'Area' containing all the three methods 'RectangleArea','SquareArea' and 'CircleArea' for printing the area of rectangle,square and circle respectively.Create an object of class 'Area' and call all the three methods.
Description: Abstract class-A class which is declared as abstract is known as an abstract class.It can have abstract and non abstract methods.

Dynamic Method Dispatch- Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time,rather than compile time.

Overriding-When the method signature ( name and parameters) are the same in the super class and the child class, it's called Overriding..*/

//Program:
import java.util.*;
abstract class ShapeAbstract{
    abstract void RectangleArea(int l,int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(double r);
}
class Area extends ShapeAbstract{
    void RectangleArea(int l,int b){
        int area=l*b;
        System.out.println("Area of Rectangle is : "+ area);
    }
    void SquareArea(int s){
        int area=s*s;
        System.out.println("Area of Square is : "+ area);
    }
    void CircleArea(double r){
        double area=3.14159265359*r*r;
        System.out.println("Area of Circle is : "+ area);
    }
}
class Test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b=sc.nextInt();
        System.out.println("Enter the side of the square : ");
        int s=sc.nextInt();
        System.out.println("Enter the radius of the circle : ");
        double r=sc.nextDouble();
        ShapeAbstract rect=new Area();
        rect.RectangleArea(l,b);
        ShapeAbstract sq=new Area();
        sq.SquareArea(s);
        ShapeAbstract circle=new Area();
        circle.CircleArea(r);
    }
}
