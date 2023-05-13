import java.io.*;
import java.util.*;

public class PangramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPangram(s));
    }
    
    public static boolean isPangram(String str){
        Set<Character> set = new HashSet<>();
        
        for (char ch : str.toCharArray()){
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
            if (ch>='A' && ch<='Z'){
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}
