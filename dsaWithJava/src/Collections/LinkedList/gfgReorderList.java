package Collections.LinkedList;

public class gfgReorderList {
    public static Node rev(Node head){
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    static void reorderlist(Node head) {
        // Your code here
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head2 = rev(head2);

        Node t1 = head;
        Node t2 = head2;

        while(t1 != null && t2 != null){
            Node temp1 = t1.next;
            Node temp2 = t2.next;

            t1.next = t2;
            t1 = temp1;

            t2.next = temp1;
            t2 = temp2;
        }
    }
    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50);  Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        reorderlist(a);
        while(a != null){
            System.out.print(a.val + " ");
            a = a.next;
        }
    }
}
