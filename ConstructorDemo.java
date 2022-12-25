/*Aim:Write a program to demonstrate a constructor.
Description:A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.It can be used to set initial values for object attributes.*/

//Program:
class ConstDemo{
    int a=10;
    float b=25;
    ConstDemo(){
        a=0;
        b=0;
        System.out.println("Constructor called in ConstDemo class!");
        System.out.println("a = "+a+" b = "+b);
    }
    ConstDemo(int a,float b){
        this.a=a;
        this.b=b;
        System.out.println("a ="+a+" b ="+b);
    }
}
class Hello extends ConstDemo{
    static int a;
    static float b;
    Hello(){
        System.out.println("Constructor called in Hello class!\n");
    }
    Hello(int a,float b){
        ConstDemo obj= new ConstDemo(a,b);
    }
    public static void main(String[] args){
        System.out.println("Hello, World!\n");
        Hello a1=new Hello();
        Hello b1=new Hello(a,b);
    }
}
