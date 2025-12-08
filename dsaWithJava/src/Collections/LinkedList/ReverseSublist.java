package Collections.LinkedList;

public class ReverseSublist {
    public static Node reverseBetween(int a, int b, Node head) {
        if(head == null || a == b) return head;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        for(int i= 1; i<a; i++){
            prev = prev.next;
        }
        Node start = prev.next;
        Node next = start.next;

        for(int i = 0; i<b-a; i++){
            start.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = start.next;
        }
        return dummy.next;
    }
    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50);  Node f = new Node(60);
        Node g = new Node(70);  Node h = new Node(80);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f; f.next = g; g.next = h;
        int x = 2, y = 5;
        Node res = reverseBetween(x,y,a);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
