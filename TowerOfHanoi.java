import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'a';
        char b = 'b';
        char c = 'c';
        towerOfHanoi(n, a, c, b);
    }
    
    public static void towerOfHanoi(int n, char a, char c, char b){
        if (n == 0){
            return;
        }
        towerOfHanoi(n - 1, a, b, c);
        System.out.println(a + " " + c);
        towerOfHanoi(n - 1, b, c, a);
    }
}
