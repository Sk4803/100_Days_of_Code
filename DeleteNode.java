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
    
    void delete(int pos){
        if(pos == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0; i<pos - 1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
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


public class DeleteNode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        while (n != -1){
            ll.addNode(n);
            n = sc.nextInt();
        }
        int position = sc.nextInt();
        ll.delete(position);
        ll.printList();
    }
}
