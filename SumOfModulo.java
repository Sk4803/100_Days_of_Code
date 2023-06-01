import java.io.*;
import java.util.*;

public class SumOfModulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(moduloSum(n, k));
    }
    
    public static int moduloSum(int n, int k){
        if(n == 1){
            return 1;
        }
        return ((n%k) + moduloSum(n - 1, k));
    }
}
