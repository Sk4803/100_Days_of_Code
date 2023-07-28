import java.io.*;
import java.util.*;

public class CarFleet {

    public static int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = position.length;
        for(int i=0; i<n; ++i){
            map.put(target - position[i], speed[i]);
        }
        int count = 0;
        double r = -1.0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int d = entry.getKey();
            int s = entry.getValue();
            double t = 1.0*d/s;
            if(t>r){
                ++count;
                r = t;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int m = sc.nextInt();
        int[] position = new int[m];
        for(int i=0; i<m; i++){
            position[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] speed = new int[n];
        for(int i=0; i<n; i++){
            speed[i] = sc.nextInt();
        }
        System.out.println(carFleet(target, position, speed));
    }
}
