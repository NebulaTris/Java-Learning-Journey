/*Problem Statement: Given an integer N, return the first N rows of Pascal’s triangle.
Input Format: N = 5
Result:
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1 */

/*Code*/
import java.io.*;
import java.util.*;
class sol {
    public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }

            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printPascal(n);
    }
}
