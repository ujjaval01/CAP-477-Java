package Collections.LinkedList;

public class Q328OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode t = head;
        ListNode d1 = new ListNode(-1);  // odd
        ListNode d2 = new ListNode(-1);  // even
        ListNode t1 = d1;
        ListNode t2 = d2;
        int count = 1;
        while(t != null){
            if(count%2 != 0){
                t1.next = t;
                t1 = t1.next;
                count++;
            }else{
                t2.next = t;
                t2 = t2.next;
                count++;
            }
            t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
    static void main() {
         ListNode a = new  ListNode(1);
         ListNode b = new  ListNode(4);
         ListNode c = new  ListNode(3);
         ListNode d = new  ListNode(2);
         ListNode e = new  ListNode(5);
         ListNode f = new  ListNode(2);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f;
         ListNode res = oddEvenList(a);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
