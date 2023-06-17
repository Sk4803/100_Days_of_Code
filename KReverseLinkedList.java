import java.io.*;
import java.util.*;

public class LinkedList {
    Node head;
    Node tail;

    
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

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

    Node kReverse(Node head, int k){
        if(head == null){
            return null;
        }
        Node cur = head;
        Node prev = null;
        Node temp = null;
        int count = 0;
    
        while(count<k && cur != null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            count++;
        }
        
        if(temp != null){
            head.next = kReverse(temp, k);
        }
        return prev;
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

class KReverseLinkedList{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList llist = new LinkedList();
        int n = sc.nextInt();
        while(n != -1){
            llist.addNode(n);
            n = sc.nextInt();
        }
        int k = sc.nextInt();
        if(k == 0){
            llist.printList();
        }
        else{
            llist.head = llist.kReverse(llist.head, k);
            llist.printList();
        }
    }
}
