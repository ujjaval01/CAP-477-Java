package Collections.LinkedList.CircularLL;

public class checkIsCLL {
    /* Function to print nodes in a given Circular linked list */
    static boolean isCircular(Node head) {
        // Your code here
        Node temp = head;
        while(temp != null){
            if(temp.next == head){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    static void main() {
        Node a = new  Node(10);
        Node b = new  Node(20);
        Node c = new  Node(30);
        Node d = new  Node(40);
        Node e = new  Node(50);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = a;
        System.out.println(isCircular(a));
    }
}
