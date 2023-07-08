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
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> lst2D = new ArrayList<List<Integer>>();
        List<Integer> lastAnswers = new ArrayList<>();
        int lastAnswer = 0 ;
        for(int i = 0 ; i<= n ; i++){
            lst2D.add(new ArrayList<Integer>());
        }
        
        for (List<Integer> query: queries){
            int type = query.get(0) ;
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x^lastAnswer)%n ;
            if(type == 1)
            {
                lst2D.get(idx).add(y) ;
            }
            else
            {
                
                lastAnswer = lst2D.get(idx).get(y% lst2D.get(idx).size()) ;
                lastAnswers.add(lastAnswer) ;
            }
        }
        return lastAnswers;
    }
}

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

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
