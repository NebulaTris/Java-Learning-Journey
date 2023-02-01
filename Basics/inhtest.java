/* To be done*/
import java.util.*;
class student
{
  void getinfo()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Roll No.:");
    int rollno=sc.nextInt();
    System.out.print("Enter Name:");
    String name=sc.nextLine();
  }
  void putinfo()
  {
    System.out.print("Roll No.:" +rollno);
    System.out.print("Name:" +name);
  }
}

