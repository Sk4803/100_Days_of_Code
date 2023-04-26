import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n + 1];
        for (int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println(rainwater(height));
    }
    
    public static int rainwater(int[] a){
        int len = a.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = a[0];
        for (int i=1; i<len; i++){
            left[i] = Math.max(left[i - 1], a[i]);
        }
        right[len - 1] = a[len - 1];
        for (int i = len - 2; i>= 0; i--){
            right[i] = Math.max(right[i + 1], a[i]);
        }
        int ans = 0;
        for (int i = 0; i<len; i++){
            ans = ans + (Math.min(left[i], right[i]) - a[i]);
        }
        return ans;
    }
}import java.io.*;
import java.util.*;

public class Rainwater {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n + 1];
        for (int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println(rainwater(height));
    }
    
    public static int rainwater(int[] a){
        int len = a.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = a[0];
        for (int i=1; i<len; i++){
            left[i] = Math.max(left[i - 1], a[i]);
        }
        right[len - 1] = a[len - 1];
        for (int i = len - 2; i>= 0; i--){
            right[i] = Math.max(right[i + 1], a[i]);
        }
        int ans = 0;
        for (int i = 0; i<len; i++){
            ans = ans + (Math.min(left[i], right[i]) - a[i]);
        }
        return ans;
    }
}
