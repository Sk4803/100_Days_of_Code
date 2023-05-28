import java.io.*;
import java.util.*;

public class GCDLargestSubset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(GCDSubset(arr, arr.length));
    }
    public static int GCDSubset(int[] arr, int n){
        int GCD = arr[0];
        for (int i = 1; i < n; i++){
            GCD = gcd(GCD, arr[i]);
        }
        return (GCD == 1)? n : 0;
    }
    
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
