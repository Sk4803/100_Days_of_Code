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
    static class Pair {
    int val, count;
        public Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
    
    public static int poisonousPlants(List<Integer> p) {
        Stack<Pair> stack = new Stack<>();
        int count = 0;
        for (int i = p.size() - 1; i >= 0; i--) {
            int temp = 0;
            while (!stack.empty() && p.get(i) < stack.peek().val) {
                temp++;
                Pair pair = stack.pop();
                temp = Math.max(temp, pair.count);
            }
            count = Math.max(count, temp);
            stack.push(new Pair(p.get(i), temp));
        }
        return count;
    }

}

public class PoisonousPlants {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.poisonousPlants(p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
