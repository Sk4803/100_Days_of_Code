import java.io.*;
import java.util.*;

public class CatalanNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(catalan(n));
    }
    
    public static int catalan(int n){
        int cat = 0;
        if(n ==0 || n==1){
            return 1;
        }
        for (int j = 0; j < n; j++){
            cat = cat + catalan(j) * catalan(n - j - 1);
        }  
        return cat;
    }
}
