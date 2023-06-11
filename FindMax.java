import java.io.*;
import java.util.*;

class LinkedList{
class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    
    public Node head = null;  
    public Node tail = null; 
    
    public void addNode(int data) {    
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;
            tail = newNode;  
        }  
    }
    
    int findMax(){
        int curMax = 0;
        while (head != null){
            if(curMax < head.data){
                curMax = head.data;
            }
            head = head.next;
        }
        return curMax;
    }
}

public class FindMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        while (n != -1){
            ll.addNode(n);
            n = sc.nextInt();
        }
        
        System.out.println(ll.findMax());
    }
}
