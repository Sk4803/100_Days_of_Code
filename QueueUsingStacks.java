import java.io.*;
import java.util.*;

class Queue {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        static void enQueue(int x){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(x);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        static int deQueue(){
            if (s1.isEmpty()){
                return -1;
            }

            int x = s1.peek();
            s1.pop();
            return x;
        }
        
        static int queueFront(){
            return s1.peek();
        }    
};

public class QueueUsingStacks {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int query = sc.nextInt();
            if(query ==1){
                q.enQueue(sc.nextInt());
            }
            else if(query == 2){
                q.deQueue();
            }
            else if(query == 3){
                System.out.println(q.queueFront());
            }
        }
    }
}
