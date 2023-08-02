import java.util.*;
class StringMatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(match(a, b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
    static boolean match(String a, String b){
        int p = 0;
        for(int i=0; i<b.length(); i++){
            if(a.charAt(p) == b.charAt(i) || a.charAt(p) == '?'){
                p++;
            }
            else if(a.charAt(p) == '*'){
                while(a.charAt(p+1) != b.charAt(i)){
                    i++;
                }
                p = p+2;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
