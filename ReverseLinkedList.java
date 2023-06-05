import java.io.*;
import java.util.*;

public class LinkedList {
    static Node head;

    
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
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

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList llist = new LinkedList();
        int n = sc.nextInt();
        while(n != -1){
            llist.push(n);
            n = sc.nextInt();
        }
        
        llist.printList();
    }
}
