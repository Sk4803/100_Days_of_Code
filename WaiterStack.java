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
    public static List<Integer> waiter(List<Integer> number, int q) {
        int prime = 2;
        List<Integer> answer = new ArrayList<>();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < number.size(); j++) {
                if (number.get(j) % prime == 0) {
                    answer.add(number.get(j));
                    number.remove(j);
                    j--;
                } else {
                    A.add(0, number.get(j));
                }
            }
            number.clear();
            number.addAll(A);
            A.clear();
            prime++;
            for (int j = 2; j < prime; j++) {
                if (prime % j == 0) {
                    prime++;
                    j = 2;
                }
            }
        }
        Collections.reverse(number);
        answer.addAll(number);
        return answer;
    }

}

public class WaiterStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.waiter(number, q);

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
