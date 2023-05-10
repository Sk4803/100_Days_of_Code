import java.io.*;
import java.util.*;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        reverseString(words);
    }
    public static void reverseString(String[] words) {
        for(int i=0; i<words.length; i++){
            StringBuilder input = new StringBuilder();
            input.append(words[i]);
            input.reverse();
            System.out.print(input + " ");
        }
    }
}
