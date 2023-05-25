import java.io.*;
import java.util.*;

public class GCDOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(GCDArray(arr));
    }
    public static int GCDArray(int[] a){
        int i = a[0];
        int j = 1;
        while(j< a.length){
            i = gcd(a, i, a[j]);
            j++;
        }
        return i;
    }
    public static int gcd(int[] arr, int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(arr, b, a%b);
    }
}
