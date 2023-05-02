import java.io.*;
import java.util.*;

public class KthLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthLargest(nums, k));
    }
    
    public static int kthLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i< arr.length; i++){
            pq.add(arr[i]);
        }
        int l = k - 1;
        while (l > 0) {
            pq.poll();
            l = l - 1;
        }
        return pq.peek();
    }
}
