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
    public static List<Double> runningMedian(List<Integer> a) {
        var results = new ArrayList<Double>(); 
        var c = List.copyOf(a);
        Collections.sort(a);

        for (int k = a.size(); k > 0; k--) {
            if (k % 2 == 0) {
                results.add(((double) a.get(k / 2) + a.get((k / 2) - 1)) / 2.0);
            } else {
                results.add((double) a.get(k / 2));
            }
            a.remove(Collections.binarySearch(a, c.get(k - 1))); 
        }
        Collections.reverse(results); 
        return results;
    }

}

public class RunningMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
