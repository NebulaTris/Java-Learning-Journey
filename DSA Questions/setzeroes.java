/*Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
*/

/*Trial Code:*/

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0)
    {
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];
        enterMatrixData(scan, matrix, n, m);
        setzeroes(matrix, n, m);
        printMatrix(matrix, n, m);
  }
}
  public static void enterMatrixData(Scanner scan, int[][] matrix, int n, int m){
          for (int i = 0; i < n; i++)
          {
              for (int j = 0; j < m; j++)
              {
                  matrix[i][j] = scan.nextInt();
              }
          }
  }
  
  public static void setzeroes(int[][] matrix, int n , int m)
  {
      for (int i = 0; i < n; i++)
          {
              for (int j = 0; j < m; j++)
              {
                  if (matrix[i][j]==0)
                  {  
                      for (int k = 0 ; k<n;k++) { 
                      matrix[k][j] = 0;  }
                      for (int k = 0 ; k<m;k++)  {
                      matrix[i][k] = 0 ; }
            }  
        }  
              }
          }

public static void printMatrix(int[][] matrix, int n, int m){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
  }
  }
