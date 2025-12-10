package LinkedList.SinglyLL;

public class FindTheFirstNodeOfLoopInLinkedList {
    public static int cycleStart(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                while(temp != slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                return temp.val;
            }
        }
        return -1;
    }
    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50);  Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        f.next = c;
        System.out.println(cycleStart(a));

    }
}
