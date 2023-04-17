/*OBJECTIVE: An educational institution wishes to maintain a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown in following figure. The figure also shows the minimum information required for each class.
Specify all classes and define functions to create the database and retrieve individual information as and when required.
 
SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
package javaapplication10;
import java.util.*;
class Staff
{
  int code;
  String name;
  Scanner sc = new Scanner (System.in);
    Staff ()
  {
    System.out.println ("Enter the code");
    code = sc.nextInt ();
    System.out.println ("Enter the name");
    name = sc.next ();
    System.out.println ("The code is:" + code);
    System.out.println ("The Name is:" + name);
  }
}
class Teacher extends Staff
{
  int publication;
    Teacher ()
  {
    System.out.println ("Enter the publication");
    publication = sc.nextInt ();
    System.out.println ("The publication is:" + publication);
  }

}
class Typist extends Staff
{
  int speed;
    Typist ()
  {
    System.out.println ("Enter the speed");
    speed = sc.nextInt ();
    System.out.println ("The speed is:" + speed);

  }

}
class Officer extends Staff
{
  char grade;
    Officer ()
  {
    System.out.println ("Enter the grade");
    grade = sc.next ().charAt (0);


    System.out.println ("The grade is:" + grade);
  }

}
class Casual extends Typist
{
  int dailywages;
    Casual ()
  {
    System.out.println ("Enter the dailywages ");
    dailywages = sc.nextInt ();
    System.out.println ("The dailywages is:" + dailywages);

  }
}
class Regular extends Typist
{
  int salary;
    Regular ()
  {
    System.out.println ("Enter the salary ");
    salary = sc.nextInt ();

    System.out.println ("The salary is:" + salary);
  }
}
public class JavaApplication10
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int x;
      System.out.println ("Enter your choice");
      System.out.println ("1.Teacher \n 2.Typist \n 3.Officer");
      x = sc.nextInt ();
    switch (x)
      {
      case 1:
	Teacher t = new Teacher ();
	break;
	case 2:Typist ty = new Typist ();
	break;
	case 3:Officer o = new Officer ();
	break;
	default:break;
      }
  }
}
