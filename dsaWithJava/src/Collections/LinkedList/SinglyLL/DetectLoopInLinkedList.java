package Collections.LinkedList.SinglyLL;

public class DetectLoopInLinkedList {
    public static boolean detectLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50);  Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        f.next = a;
        System.out.println(detectLoop(a));

    }
}
