package LeetCodeQuestions;

public class Q86PartitionList {
    public static ListNode partition(ListNode head, int x) {
        // if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;;
        ListNode t2 = d2;
        while(temp != null){
            if(temp.val < x){
                t1.next = temp;
                t1 = t1.next;
            }else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
    static void main() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f;
        ListNode res = partition(a, 3);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
