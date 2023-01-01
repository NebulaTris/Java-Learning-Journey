/*Aim:Program to demonstrate concept of super.
Description: Super-The Super keyword in Java is a reference variable which is used to refer immediate parent class object.*/

//Program:
class Animal{
    Animal(){
        System.out.println("Animal is created.");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created.");
    }
}
class TestSuper{
    public static void main(String[] args){
        Dog d= new Dog();
    }
}
