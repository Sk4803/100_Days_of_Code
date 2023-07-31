import java.io.*;
 
class EggDrop {
    static int minTrials(int n, int k){
        int dp[] = new int[n + 1], m;
        for (m = 0; dp[n] < k; m++) {
            for (int x = n; x > 0; x--) {
                dp[x] += 1 + dp[x - 1];
            }
        }
        return m;
    }

    public static void main(String[] args){
        int n = 2, k = 36;
        System.out.println(minTrials(2, 36));
    }
}
