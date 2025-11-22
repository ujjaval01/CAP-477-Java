package Collections.LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    public static void displayRec(Node head) {
        if (head == null) return;
        System.out.print(head.val + " ");
        displayRec(head.next);

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int getEleInIdx(Node head, int idx) {  // 0 based Indexing....
//        int res = 0;
        for (int i = 0; i < idx; i++) {
//            res = head.val;
//            head = head.next;
            head = head.next;
        }
        return head.val;
    }
}

public class SimpleLinkedList {
    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50); Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
//        System.out.println(a);
//        System.out.println(a.next);
//        display(a);
//        displayRec(a);
        System.out.println(Node.getEleInIdx(a, 2));
    }

}
