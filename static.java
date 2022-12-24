/*Aim: Program to demonstrate concept of static.
Description: In Java,the keyword static means that the particular member belongs to a type itself,rather than to an instance of that type. This means we will create only one instance of that static member that is shared across all instances of the class.*/

//Program:
class StaticDemo
{
    static int a=42;
    static int b=99;
    static int x;
    static void callvar(){
        System.out.println("a = "+a);
        
    }
    static void callmember(){
        x=b;
        System.out.println("x = "+x);
    }
    static{
        System.out.println("Static Block 1\n");
    }
    static{
        System.out.println("Static Block 2");
    }
    public static void main(String[] args){
        callvar();
        callmember();
        StaticDemo obj = new StaticDemo();
        obj.callvar();
        System.out.println("b = "+b);
    }
}
 
