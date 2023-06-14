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
    
    boolean isPalindrome(){
        if(head == null){
            return true;
        }
        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node cur = head;
        while(last != null){
            if(last.data != cur.data){
                return false;
            }
            last = last.next;
            cur = cur.next;
        }
        return true;
    }
    
    Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}

public class PalindromeLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        while (n != -1){
            ll.addNode(n);
            n = sc.nextInt();
        }
        System.out.println(ll.isPalindrome());
    }
}
