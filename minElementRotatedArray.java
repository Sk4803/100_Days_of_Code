import java.io.*;
import java.util.*;

public class minElementRotatedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(minElement(nums));
    }
    
    public static int minElement(int[] a){
        int i=0;
        int j= a.length - 1;
        int element = 0;
        if (a[i]<a[j]){
            element = a[i];
        }
        else{
            while (a[i]>=a[j]){
                i++;
                j--;
            }    
            if (a[i]<a[i - 1]){
                element = a[i];
            }
            else{
                element = a[i - 1];
            }
        }
        return element;
    }
}
