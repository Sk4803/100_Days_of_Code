import java.io.*;
import java.util.*;

public class RecursiveLinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(recSearch(arr, 0, arr.length - 1, x));
            
    }
   
    public static boolean recSearch(int arr[], int l, int r, int x){
          if (r < l)
             return false;
          if (arr[l] == x)
             return true;
          if (arr[r] == x)
             return true;
          return recSearch(arr, l+1, r-1, x);
     }
}
