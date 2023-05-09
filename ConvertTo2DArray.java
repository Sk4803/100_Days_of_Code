import java.io.*;
import java.util.*;

public class ConvertTo2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        int temp = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[temp] + " ");
                temp++;
            }
            System.out.println();
        }
    }
}
