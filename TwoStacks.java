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
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0; i<a.size(); i++){
            st1.push(a.get(i));
        }
        for(int i=0; i<b.size(); i++){
            st2.push(b.get(i));
        }
        int lengthB=0;
        int sum = 0;
        while(lengthB<b.size() && (sum+b.get(lengthB)) <= maxSum ){
            sum += b.get(lengthB);
            lengthB++;
        }
        int maxScore = lengthB;
        for(int i=0; i<a.size(); i++){
            sum += a.get(i);
            while( sum > maxSum && lengthB > 0){
                lengthB--;
                sum -= b.get(lengthB);
            }
            if(sum>maxSum){
                break;
            }
            maxScore = Math.max( maxScore,lengthB + i+1 );
        }
        return maxScore;
    }

}

public class TwiStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int maxSum = Integer.parseInt(firstMultipleInput[2]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.twoStacks(maxSum, a, b);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
