package LeetCodeQuestions;

public class Q61RotateListByK {
    public static int length(ListNode head){
        int len = 0;
        ListNode temp = head;
        while (temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public static ListNode rotateList(ListNode head, int k){
        int n = length(head);
        k %= n;
        if(head == null || head.next == null || k == 0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i<k+1; i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode temp = a;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return a;
    }
    static void main() {
        ListNode a = new ListNode(10); ListNode b = new ListNode(20);
        ListNode c = new ListNode(30); ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);  ListNode f = new ListNode(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        int k = 2;
        ListNode temp = rotateList(a, k);
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
