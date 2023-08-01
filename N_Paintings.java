import java.util.*;
class N_Paintings{
    static final int modd = 1000000007;
    static long power(long x, long y, long p){
        long res = 1;
        x = x % p;
        while (y > 0){
            if (y % 2 == 1){
                res = (res%p * x%p) % p;
            }
            y = y >> 1;
            x = (x%p * x%p) % p;
        }
        return res;
    }
    static int ways(int n, int m){
        return (int) (power(m - 1, n - 1, modd) * m % modd);
    }
  
    public static void main(String[] args){
        int n = 5, m = 5;
        System.out.println(ways(n, m));
         
    }
}
