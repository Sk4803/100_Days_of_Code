import java.io.*;
import java.util.*;

public class IndexOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=  sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        indexNum(arr, x);
    }
    
    public static void indexNum(int[] arr, int x){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.print(i + " ");
            }
        }
    }
}
