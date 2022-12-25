/*Aim:Program to demonstrate Overloading and Overriding of Method.
Description:Overloading-When two or more methods in the same class have the same name but different parameters, it is called Overloading.
Overriding-When the method signature (name and parameters) are the same in the super class and the child class, it's called Overriding.*/

//Program:
class overloadandoverride{
    int x=10;
    void methodoverloadandoverride(){
        System.out.println("Method in superclass overloadandoverride.");
    }
    void methodoverloadandoverride(int x){
        this.x=x;
        System.out.println("\nMethod Overloading\n");
        System.out.println("Value of x is: "+x);
    }
}
class B extends overloadandoverride{
    int x=20;
     void methodoverloadandoverride(){
         System.out.println("\nMethod Overriding\n");
         System.out.println("Method in class B.");
         System.out.println("Calling method in superclass overloadandoverride.");
         super.methodoverloadandoverride();
         System.out.println("\nOutputting Overriden value of x from superclass OverloadAndOverride\n");
         System.out.println("The value of x in class B is : "+x);
         System.out.println("The value of x in superclass overloadnadoverride is: "+super.x);
}
}
class C{
    public static void main(String[] args){
        System.out.println("Hello World!!");
        B b=new B();
        b.methodoverloadandoverride();
         b.methodoverloadandoverride(12);
    }
}
