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

    /*
     * Complete the 'minimumAverage' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY customers as parameter.
     */

    public static long minimumAverage(List<List<Integer>> customers) {
        if(customers.isEmpty()){
            return 0;
        }

        int size = customers.size();

        customers = customers.stream().sorted((o1, o2) -> {
            return o1.get(0) - o2.get(0);
        }).collect(Collectors.toList());

        long waiting = 0;

        PriorityQueue<List<Integer>> cookingQueue = new PriorityQueue<>(size,new MyComparator());
        List<Integer> firstOrder = customers.remove(0);
        cookingQueue.add(firstOrder);

        long timer = firstOrder.get(0);

        while(!cookingQueue.isEmpty()){
            List<Integer> order = cookingQueue.poll();
            timer = timer + order.get(1);
            waiting = waiting + (timer - order.get(0));
            // order in between cooking
            while(
                !customers.isEmpty()
                && customers.get(0).get(0) < timer
            ){
                cookingQueue.add(customers.remove(0));
            }

            // order received after previous order is cooked
            if(
                cookingQueue.isEmpty()
                && !customers.isEmpty()
            ){
                cookingQueue.add(customers.remove(0));
            }
        }
        return waiting/size;
    }

}
class MyComparator implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        return o1.get(1).compareTo(o2.get(1));
    }
}

public class MinAvgWaitingTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> customers = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                customers.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.minimumAverage(customers);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
