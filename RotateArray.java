import java.io.*;
import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        for (int i=0; i<k; i++){
            int j, last;
            last = nums[nums.length - 1];
            
            for (j = nums.length - 1; j>0; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
