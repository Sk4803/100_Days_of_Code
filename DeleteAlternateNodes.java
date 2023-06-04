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

    void deleteAlt()
    {
        if (head == null)
            return;

        Node node = head;

        while (node != null && node.next != null) {
            node.next = node.next.next;
            node = node.next;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
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
        
        llist.deleteAlt();
        head = llist.reverse();
        llist.printList();
    }
}
