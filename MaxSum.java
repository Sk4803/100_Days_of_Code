import java.io.*;
import java.util.*;

public class MaxSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSumSubarray(nums));
    }
    
    public static int maxSumSubarray(int[] a){
        int maxsum = 0;
        int cursum = 0;
        
        for (int i=0; i<a.length; i++){
            cursum = cursum + a[i];
            if (cursum > maxsum){
                maxsum = cursum;
            }
            if (cursum <0){
                cursum = 0;
            }
        }
        return maxsum;            
    }
}
