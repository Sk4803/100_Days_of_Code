import java.io.*;
import java.util.*;

class UserNameValidator{
    public static final String regularExpression = "^([a-zA-Z][a-zA-Z0-9_]{7,29})$";
}

public class UserNameValid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());
        while (numberOfLines-- != 0) {
            String userName = sc.nextLine();

            if (userName.matches(UserNameValidator.regularExpression)) {
                System.out.printf("%s\n","Valid");
            } 
            else {
                System.out.printf("%s\n","Invalid");
            }   
        }
    }
}
