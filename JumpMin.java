import java.io.*;
import java.util.*;

public class JumpMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(minJumps(nums));
    }
    
    public static boolean minJumps(int[] nums) {
        int boundary = 0;
        for(int i =0;i<=boundary;i++){
            boundary = Math.max(boundary,i+nums[i]);
            if(boundary >=nums.length-1)
                return true;
        } 
        return false;
    }
}
