import java.io.*;
import java.util.*;

class Queue {
    static private int front, rear, capacity;
    static private int queue[];
 
    Queue(int c){
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
    
    static void queueEnqueue(int data){
        if (capacity == rear){
            return;
        }
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void queueDisplay(){
        int i;
        if (front == rear) {
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        return;
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Queue q = new Queue(n);
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            q.queueEnqueue(arr[i]);
        }
        q.queueDisplay();
    }
}
