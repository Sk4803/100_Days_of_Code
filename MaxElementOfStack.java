import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
        Stack <Integer> s = new Stack<>();
        Stack <Integer> s1 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        for (String i : operations){
            if(i.startsWith("1")) {
                String[] array = i.split(" ");
                int x = Integer.valueOf(array[1]);
                s.push(x);
                if(s1.isEmpty() || x> s1.peek()){
                    s1.push(x);
                }
                else{
                    int temp = s1.peek();
                    s1.push(temp);
                }               
            }
            else if(i.equals("2")){
                s.pop();
                s1.pop();
            }
            else if(i.equals("3")){
                list1.add(s1.peek());              
            }
        }
        return list1;
    }

}

public class MaxElementOfStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
