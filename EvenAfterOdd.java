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
    
    void evenAfterOdd(){
        Node end = head;
        Node prev = null;
        Node cur = head;
        
        while(end.next != null){
            end = end.next;
        }
        Node new_end = end;
        
        while(cur.data % 2 == 0 && cur != end){
            new_end.next = cur;
            cur = cur.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        
        if(cur.data % 2 != 0){
            head = cur;
            
            while (cur != end) {
                if (cur.data % 2 != 0) {
                    prev = cur;
                    cur = cur.next;
                }
                else {
                    prev.next = cur.next;
                    cur.next = null;
                    new_end.next = cur;
                    new_end = cur;
                    cur = prev.next;
                }
            }
        }
        else{
            prev = cur;
        }
        
        if (new_end != end && end.data % 2 == 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }
    
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class EvenAfterOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        while (n != -1){
            ll.addNode(n);
            n = sc.nextInt();
        }
        ll.evenAfterOdd();
        ll.printList();
    }
}
