import java.io.*;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        System.out.println(binarySearch(arr, index));
    }
    
    public static int binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid] == key){
                return mid;
            }
            else if(key>a[mid]){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
