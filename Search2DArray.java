import java.io.*;
import java.util.*;

public class Search2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(findAns(matrix, target));
    }
    
    public static boolean findAns(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0, h = row * col - 1;
        
        while (l <= h) {
            int mid = l + (h - l) / 2;
 
            int tC = mid % col;
            int tR = mid / col;
            int val = matrix[tR][tC];
            if (val == target)
                return true;
 
            if (val < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
 
        return false;
    }
}
