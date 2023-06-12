import java.io.*;
import java.util.*;

public class BalancedParantheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }
    
    public static boolean isBalanced(String s){
        Stack stack = new Stack();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            char current = charArray[i];
            if (current == '{' || current == '[' || current == '('){
                stack.push(current);   
                continue;
            }
            if (stack.isEmpty()) {    
                return false;   
            }
            char popChar;   
            switch (current) {   
                case ')':   
                popChar = (char) stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }  
        }
        return (stack.isEmpty()); 
    }
}
