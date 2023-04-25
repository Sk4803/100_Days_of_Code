import java.io.*;
import java.util.*;

public class BuySellStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maxProfit(a));
    }
    
    public static int maxProfit(int[] a){
        int maxProfit = 0;
        int minSoFar = a[0];
        for (int i=0; i<a.length; i++){
            minSoFar = Math.min(minSoFar, a[i]);
            int Profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, Profit);
        }
        return maxProfit;
    }
}
