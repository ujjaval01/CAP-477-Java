package LinkedList.CircularLL;

public class PrintCircularLL {
    /* Function to print nodes in a given Circular linked list */
    static void printList(Node head) {
        // Your code here
        System.out.print(head.val + " ");
        Node temp = head.next;
        while(temp != head){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    static void main() {
        Node a = new  Node(10);
        Node b = new  Node(20);
        Node c = new  Node(30);
        Node d = new  Node(40);
        Node e = new  Node(50);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = a;
        printList(a);
    }
}

