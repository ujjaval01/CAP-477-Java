package Collections.LinkedList;

public class gfgPartitionALinkedListAroundAGivenValue {
    public static Node partition(Node head, int x) {
        // Your code here
        Node t = head;
        Node d1 = new Node(-1);  // smmaller
        Node d2 = new Node(-1);  // greater
        Node d3 = new Node(-1); // equal
        Node t1 = d1; Node t2 = d2; Node t3 = d3;
        while(t != null){
            if(t.val < x){
                t1.next = t;
                t1 = t1.next;
            }else if(t.val > x){
                t2.next = t;
                t2 = t2.next;
            }else{
                t3.next = t;
                t3 = t3.next;
            }
            t = t.next;
        }
        t1.next = d3.next;
        t3.next = d2.next;
        t2.next = null;
        return d1.next;

    }
    static void main() {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(5);
        Node f = new Node(2);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f;
        Node res = partition(a, 3);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
