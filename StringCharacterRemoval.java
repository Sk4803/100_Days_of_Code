import java.io.*;
import java.util.*;

public class StringCharacterRemoval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(newString(S));
    }
    public static String newString(String s){
        if(s.length() == 0){
            return "";
        }
        if (s.charAt(0) == 'x'){
            return newString(s.substring(1));
        }
        return s.charAt(0) + newString(s.substring(1));
    }
}
