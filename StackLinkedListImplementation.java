import java.io.*;
import java.util.*;

class MyStack{
class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    
    public Node head;  
    public int Size; 
    
    MyStack() {    
        head = null;
        Size=0;
    }
    
    void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        Size++;
        head = temp;
    }
    
    int pop(){
        if(head == null){
            return -1;
        }
        int res = head.data;
        head = head.next;
        Size--;
        return res;
    }
    
    int top(){
        if(head == null){
            return -1;
        }
        return head.data;
    }
    
    int size(){
        return Size;
    }
    
    boolean isEmpty(){
        return head == null;
    }
}

public class StackLinkedListImplementation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack();
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int query = sc.nextInt();
            switch(query){
                case 1:
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                    
                case 2:
                    System.out.println(st.pop());
                    break;
                    
                case 3:
                    System.out.println(st.top());
                    break;
                
                case 4:
                    System.out.println(st.size());
                    break;
                    
                case 5:
                    System.out.println(st.isEmpty());
            }
        }
    }
}
