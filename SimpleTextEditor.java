import java.io.*;
import java.util.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader scan = new BufferedReader(inputStream);
            int limit = Integer.parseInt(scan.readLine());
            Stack<String> stack = new Stack<String>();
            String str = "";
            stack.push(str);
            for (int i = 0; i < limit; i++) {
                String input = scan.readLine();
                String[] inputArray = input.split(" ");
                switch (inputArray[0]) {
                case "1":
                    String value = inputArray[1];
                    str = str + value;
                    stack.push(str.toString());
                    break;
                case "2":
                    int delIndex = Integer.parseInt(inputArray[1]);
                    str = str.substring(0, str.length() - delIndex);
                    stack.push(str);
                    break;
                case "3":
                    int printIndex = Integer.parseInt(inputArray[1]);
                    System.out.println(str.charAt(printIndex - 1));
                    break;
                case "4":
                    stack.pop();
                    str = stack.peek();

                    break;
                }
            }
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
