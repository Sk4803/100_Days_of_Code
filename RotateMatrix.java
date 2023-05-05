import java.io.*;
import java.util.*;

public class RotateMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] nums = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        rotate(nums);
    }
        
    public static void rotate(int[][] matrix) 
    {
        int n =matrix.length;
        int matrix1[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix1[i][j]=matrix[n-1-j][i];
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j]=matrix1[i][j];
            }
        }
        
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
