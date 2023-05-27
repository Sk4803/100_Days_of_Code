import java.io.*;
import java.util.*;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve(n+1);
    }
    
    public static void sieve(int n){
        boolean[] bool = new boolean[n];
        for (int i = 0; i<bool.length; i++){
            bool[i] = true;
        }
        for (int i = 2; i<Math.sqrt(n); i++){
            if(bool[i] == true){
                for(int j = (i*i); j<n; j = j+i){
                    bool[j] = false;
                }
            }
        }
        for (int i = 2; i<bool.length; i++){
            if(bool[i]==true){
                System.out.print(i + " ");
            }
        }
    }
}
