import java.io.*;
import java.util.*;

public class SineWave {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        sineWave(matrix, m, n);
    }
    
    public static void sineWave(int[][] matrix, int m, int n){
        for (int i=0; i<n; i++){
            if (i%2 == 0){
                for (int j=0; j<m; j++){
                    System.out.print(matrix[j][i] + " ");
                }
            }
            else{
                for(int j= m - 1; j>=0; j--){
                    System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }
}
