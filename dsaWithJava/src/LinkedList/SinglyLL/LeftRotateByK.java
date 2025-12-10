package LinkedList.SinglyLL;

public class LeftRotateByK {
    public static int length(Node head){
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public static Node rotate(Node head, int k) {
        int n = length(head);
        k %= n;
        if(head == null || head.next == null || k == 0) return head;
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<k; i++){
            slow = slow.next;
        }
        Node a = slow.next;
        slow.next = null;
        Node temp = a;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return a;
    }

    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50); Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;

        Node temp =  rotate(a, 2);
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
