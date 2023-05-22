import java.io.*;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] a, int l, int h){
        if(l<h){
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot+1, h);
        }
    }
    public static int partition(int[] a, int l, int h){
        int pivot = a[h];
        int i = l - 1;
        
        
        for(int j=l; j<=h; j++){
            if(a[j]< pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, h);
        return i+1;
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
