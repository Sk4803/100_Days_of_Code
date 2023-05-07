import java.io.*;
import java.util.*;

public class MatrixSpiral {

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
        spiralOrder(matrix);
    }
    
    public static void spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
 
        if (matrix.length == 0)
            System.out.print("");
 
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
 
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
 
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        for (int i = 0; i < ans.size();i++){               
            System.out.print(ans.get(i) + " ");         
        }   
    }
}
