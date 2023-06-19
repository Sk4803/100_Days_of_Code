import java.io.*;
import java.util.*;

public class StackUsingArray {
    static int capacity = 1000;
    static int top = -1;
    static int a[] = new int[capacity];
    
    static void push(int data){
        a[++top] = data;
    }
    
    static void pop(){
        top--;
    }
    
    static void print(){
        for (int i=0; i<=top; i++){
            System.out.println(a[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            if(s.equals("Push")){
                int data = sc.nextInt();
                push(data);
            }
            else if(s.equals("Pop")){
                pop();
            }
            else if(s.equals("Print")){
                print();
            }
            else{
                System.out.println(s + ".");
            }
        }
    }
}
