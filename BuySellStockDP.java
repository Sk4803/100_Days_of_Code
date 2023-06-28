import java.io.*;
import java.util.*;

public class BuySellStockDP {

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
        if(a == null || a.length <= 1) return 0;
        int[] local = new int[3];
        int[] global = new int[3];
        for(int i = 0; i < a.length - 1; i++){
            int diff = a[i + 1] - a[i];
            for(int j = 2; j >= 1; j--){
                local[j] = Math.max(global[j - 1] + Math.max(diff, 0), local[j] + diff);
                global[j] = Math.max(global[j], local[j]);
            }
        }
        return global[2];
    }
}
