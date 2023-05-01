import java.io.*;
import java.util.*;

public class MinMoves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int avg = 0;
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
            avg = avg + nums[i];
        }
        avg = avg/n;
        System.out.println(minMoves(nums, avg));
    }
    
    public static int minMoves(int[] a, int avg){
        int moves = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] > avg){
                moves = moves + (a[i] - avg);
            }
            else if (avg > a[i]){
                moves = moves + (avg - a[i]);
            }
        }
        return moves;
    }
}
