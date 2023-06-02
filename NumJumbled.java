import java.io.*;
import java.util.*;

public class NumJumbled {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isJumbled(n));
    }
    public static boolean isJumbled(int n){
        if(n/10 == 0){
            return true;
        }
        while(n != 0){
            if(n/10 == 0){
                return true;
            }
            int digit1 = n%10;
            int digit2 = (n/10)%10;
            if(Math.abs(digit1 - digit2) > 1){
                return false;
            }
            n = n/10;
        }
        return true;
    }
}
