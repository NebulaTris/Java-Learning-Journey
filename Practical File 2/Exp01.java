/* OBJECTIVE: Write a program to print the given pattern
1
2 3
4 5 6

SOFTWARE USED: NetBeans IDE */

//SOURCE CODE:

package javaapplication9; import java.util.Scanner;
public class JavaApplication9 {
  public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in); 
    int k=0;
    for(int i=1; i<=4;i++)
    {
      for (int j=1; j<=i;j++)
      {
        System.out.print(++k+" ");
      }
      System.out.println();
    }
  }
}


