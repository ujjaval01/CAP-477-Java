package LeetCodeQuestions;

public class Q143ReorderList {
    public static ListNode rev(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public static void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = rev(head2);

        ListNode t1 = head;
        ListNode t2 = head2;

        while(t1 != null && t2 != null){
            ListNode temp1 = t1.next;
            ListNode temp2 = t2.next;

            t1.next = t2;
            t1 = temp1;

            t2.next = temp1;
            t2 = temp2;

        }
    }
    static void main() {
        ListNode a = new ListNode(20);ListNode b = new ListNode(10);
        ListNode c = new ListNode(15);ListNode d = new ListNode(42);
        ListNode e = new ListNode(19); ListNode f = new ListNode(11);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        reorderList(a);
        while (a != null){
            System.out.print(a.val + " ");
            a = a.next;
        }
    }
}
