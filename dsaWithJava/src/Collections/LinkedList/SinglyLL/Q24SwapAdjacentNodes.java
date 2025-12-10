package Collections.LinkedList.SinglyLL;

public class Q24SwapAdjacentNodes {
    public static ListNode swapPairs(ListNode head) {
        // Dummy node to handle head changes
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while(current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to next pair
            current = first;
        }

        return dummy.next;
    }
    static void main() {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b; b.next = c; c.next = d; d.next = e;
        ListNode res = swapPairs(a);
        while(res != null){
            System.out.print(res.val + " ");
            res= res.next;
        }
    }
}
