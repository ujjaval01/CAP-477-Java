package LeetCodeQuestions;

public class Q206RevALinkedList {
//    public static ListNode reverseListUsingRecursion(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode a = head.next;
//        head.next = null;
//        ListNode b = reverseList(a);
//        a.next = head;
//        return b;
//    }
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    static void main() {
         ListNode a = new  ListNode(10);
         ListNode b = new  ListNode(20);
         ListNode c = new  ListNode(30);
         ListNode d = new  ListNode(40);
         ListNode e = new  ListNode(50);
        a.next = b; b.next = c; c.next = d; d.next = e;
         ListNode res = reverseList(a);
        while(res != null){
            System.out.print(res.val + " ");
            res= res.next;
        }
    }
}
