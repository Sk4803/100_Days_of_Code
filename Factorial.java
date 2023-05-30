import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    
    public static BigInteger fact(int n){
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
