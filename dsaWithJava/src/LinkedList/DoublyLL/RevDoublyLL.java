package LinkedList.DoublyLL;

public class RevDoublyLL {
    public static Node reverse(Node head) {
        // code here
        Node curr = head;
        Node prev = null;
        Node fwd;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            curr.prev = fwd;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void main() {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        Node res = reverse(a);
        display(res);



    }
}
