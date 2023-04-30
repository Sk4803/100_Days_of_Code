import java.io.*;
import java.util.*;

public class DutchNationalFlagAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        DNF(arr, arr.length);
    }
    
    public static void DNF(int[] arr, int l){
        int lo = 0;
        int hi = l - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                    
                case 1:{
                    mid++;
                    break;
                }
                    
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        
        for(int i=0; i<l; i++){
            System.out.print(arr[i] + "");
        }
    }
}
