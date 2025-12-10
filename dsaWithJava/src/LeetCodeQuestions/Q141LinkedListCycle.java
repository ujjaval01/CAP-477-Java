package LeetCodeQuestions;

//import Collections.LinkedList.SinglyLL.Node;

public class Q141LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    static void main() {
        ListNode a = new ListNode(10); ListNode b = new ListNode(20);
        ListNode c = new ListNode(30); ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);  ListNode f = new ListNode(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        f.next = a;
        System.out.println(hasCycle(a));
    }
}
