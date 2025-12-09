package Collections.LinkedList.CircularLL;

public class SplitInPair {
    public static Pair<Node, Node> splitList(Node head) {
        // Code here
        if(head == null || head.next == null) return new Pair<>(head, null);
        Node slow = head;
        Node fast = head;
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head1;
        Node head2;

        if(fast.next == head){
            fast.next = slow.next;
            head2 = fast.next;
        }
        else{
            fast.next.next = slow.next;
            head2 = fast.next.next;
        }
        slow.next = head;
        head1 = head;

        return new Pair<>(head1, head2);
    }
    public static void printCircularList(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    static void main() {
        Node a = new  Node(10);
        Node b = new  Node(20);
        Node c = new  Node(30);
        Node d = new  Node(40);
        Node e = new  Node(50);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = a;
        Pair<Node, Node> res = splitList(a);
        System.out.print("L1: "); printCircularList(res.getKey());
        System.out.print("L2: "); printCircularList(res.getValue());

    }
}
