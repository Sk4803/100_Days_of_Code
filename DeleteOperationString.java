import java.util.Scanner;
class DeleteOperationString{
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[] dp = new int[n+1];
        
        for(int j=0; j<=n; j++){
            dp[j] = j;
        }

        for(int i=1; i<=m; i++){
            int prev = dp[0];
            dp[0] = i;

            for(int j=1; j<=n; j++){
                int temp = dp[j];
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[j] = prev;
                }
                else{
                    dp[j] = 1 + Math.min(dp[j], dp[j - 1]);
                }
                prev = temp;
            }
        }
        return dp[n];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        System.out.println(minDistance(word1, word2));
    }
}
