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
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int count = 0;
        for (int i=0; i<A.size(); i++){
            if (A.get(i)>k)
                count += 1;
            pq.add(A.get(i));
        }
        if (count == A.size())
            return 0;
        else
            count=0;
            boolean bool = true;
            while (pq.size()>1 && bool){
                bool = false;
                int first = pq.poll();
                int second = pq.poll();
                int combined = first + (2*second);
                pq.add(combined);
                count += 1;
            
                for (int i : pq){
                    if (i<k)
                        bool = true;
                        break;
                }
            }
            if (pq.size() ==1 && pq.poll()<k)
                return -1;
            return count;

    }

}

public class JesseAndCookies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
