package Collections.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution2{
    public ListNode swapPairs(ListNode head) {
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
}



public class Q24SwapAdjacentNodes {
    static void main() {
        Solution s = new Solution();
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        ListNode n = s.middleNode(a);
        ListNode n = s.swapPairs(a);
        ListNode temp = n;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
        System.out.println();


    }
}
