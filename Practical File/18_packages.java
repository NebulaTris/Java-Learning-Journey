/*Aim:Write java packages and import them.
Description:Packages- A java package is a group of similar types of classes,interfaces and sub-packages.*/

//Program:
//Main.java
package Pack1;
import Pack2.D;
import Pack2.E;

public class Main{
    public static void main(String[] args){
        A object=new A();
        object.var();
        B object1=new B();
        object1.var();
        C object2=new C();
        object2.var();
        D object3=new D();
        object3.var();
        E object4=new E();
        object4.var();
    }
}
//A.java
package Pack1;
public class A{
    int i=10;
    int j=11;
    protected int k=12;
    public int l=13;
    void var(){
        System.out.println("Variables in A are: "+i+","+j+","+k+","+l);
    }
}
//B.java
package Pack1;
class B extends A{
    void var(){
        System.out.println("Accessible Variables in B are: "+super.i+","+super.j+","+super.k+","+super.l);
    }
}
//C.java
package Pack1;
class C{
    void var(){
        A obj=new A();
        System.out.println("Accessible Variables in C are: "+obj.i+","+obj.k+","+obj.l);
    }
}
//D.java
package Pack2;
import Pack1.A;
public class D extends A{
    public void var(){
        System.out.println("Accessible Variables in D are: "+super.k+","+super.l);
    }
}
//E.java
package Pack2;
import Pack1.A;

public class E{
    public void var(){
        A obj=new A();
        System.out.println("Accessible Variables in E are: "+obj.l);
    }
}
