import java.io.*;
import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void mergeSort(int[] a, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);
            merge(a, l, mid, r);
        }
    }
        
    public static void merge(int[] a, int l, int mid, int r){
        int[] b = new int[a.length];
        int i = l;
        int j = mid+1;
        int k = l;
        while(i<= mid && j<=r){
            if(a[i]<a[j]){
                b[k] = a[i];
                i++;
            }
            else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k] = a[j];
                k++;
                j++;
            }
        }
        else{
            while(i<=mid){
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for(k=l; k<=r; k++){
            a[k] = b[k];
        }
    }
}
