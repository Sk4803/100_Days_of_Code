import java.io.*;
import java.util.*;

public class DailyTemperaturesUsingStack {

    public static int[] waiting(int[] temps){
        int len = temps.length;
        int[] daysOfWait = new int[len];
        Arrays.fill(daysOfWait, 0);
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<len; i++){
            while (!s.isEmpty() && temps[s.peek()] < temps[i]){
                daysOfWait[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }
        return daysOfWait;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temps = new int[n];
        for(int i=0; i<n; i++){
            temps[i] = sc.nextInt();
        }
        int[] ans = waiting(temps);
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
