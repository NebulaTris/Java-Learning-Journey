/*Aim:Create an abstract class 'Parent' with a method 'message'.It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

Description: Abstract class-A class which is declared as abstract is known as an abstract class.It can have abstract and non abstract methods.

Dynamic Method Dispatch- Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time,rather than compile time.

Overloading-When two or more methods in the same class have the same name but different parameters,it is called Overloading.*/

//Program:
abstract class Parent{
    abstract void message();
}
class Child1 extends Parent{
    void message(){
        System.out.println("This is first subclass.\n");
    }
}
class Child2 extends Parent{
    void message(){
        System.out.println("This is second subclass.\n");
    }
}
class Test{
    public static void main(String[] args){
        Parent Child1=new Child1();
        Child1.message();
        Parent Child2=new Child2();
        Child2.message();
    }
}
