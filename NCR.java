import java.io.*;
import java.util.*;

public class NCR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(ncr(n, r));
    }
    
    public static int ncr(int n, int r){
        int ans = 0;
        if(r == 0 || r == n){
            return 1;
        }
        if (r == n){
            return n;
        }
        ans = fact(n);
        ans = ans/fact(n - r);
        ans = ans/fact(r);
        return ans;
    }
    
    public static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*fact(n - 1);
    }
}
