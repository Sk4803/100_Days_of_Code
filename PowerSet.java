import java.io.*;
import java.util.*;

public class PowerSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cur = "";
        System.out.print('[');
        powerSet(str, 0, cur);
        System.out.print(']');
    }
    public static void powerSet(String s, int i, String cur){
        if(i == s.length()){
            if(cur == ""){
                System.out.print(cur);
            }
            else{
                System.out.print(cur + ", ");
            }
            return;
        }
        powerSet(s, i+1, cur + s.charAt(i));
        powerSet(s, i+1, cur);
    }
}
