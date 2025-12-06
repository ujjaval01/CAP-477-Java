package LeetCodeQuestions;
public class Q148SortList {
    public static ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head, head2);
    }

    static ListNode merge(ListNode a, ListNode b) {
        ListNode i = a;
        ListNode j = b;
        ListNode d = new ListNode(-1);
        ListNode k = d;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i == null) k.next = j;
        else k.next = i;
        return d.next;
    }
    static void main() {
       ListNode a = new ListNode(20);ListNode b = new ListNode(10);
       ListNode c = new ListNode(15);ListNode d = new ListNode(42);
       ListNode e = new ListNode(19); ListNode f = new ListNode(11);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        ListNode res = mergeSort(a);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
