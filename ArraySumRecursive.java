import java.io.*;
import java.util.*;

public class ArraySumRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfArray(arr, 0, 0));
    }
    public static int sumOfArray(int[] arr, int index, int sum){
        if (index == arr.length){
            return sum;
        }
        else{
            sum = sum + arr[index];
            index++;
            return(sumOfArray(arr, index, sum));
        }
    }
}
