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
    public static long largestRectangle(List<Integer> h) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int maxAns = h.get(0);
        int[] ps = new int[h.size()];
        int[] ns = new int[h.size()];
        for (int i = 0; i < h.size(); i++) {
            ps[i] = -1;
            ns[i] = h.size();
        }
        int i = 0;
        while (i < h.size()) {
            while (!s.empty() && s.peek() != -1 && h.get(i) < h.get(s.peek())) {
                ns[s.peek()] = (int)i;
                s.pop();
            }
            if (i > 0 && h.get(i) == h.get((i - 1))) {
                ps[i] = ps[(int)(i - 1)];
            }
            else {
                ps[i] = s.peek();
            }
            s.push(i);
            i++;
        }
        for(i=0; i<h.size(); i++){
            maxAns = Math.max(maxAns, h.get(i) * (ns[i] - ps[i] - 1));
        }
        return maxAns;
    }
}

public class LargestRectangleHistogram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
