import java.io.*;
import java.util.*;

public class SquareRootUsingLog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(sqrRoot(n));
    }
    
    public static double sqrRoot(double n){
        double ans = 0;
        ans = Math.pow(2, 0.5 * (Math.log(n) / Math.log(2)));
        if (ans == Math.floor(ans)){
            int newAns = (int)ans;
            return newAns;
        }
        return ans;
    }
}
