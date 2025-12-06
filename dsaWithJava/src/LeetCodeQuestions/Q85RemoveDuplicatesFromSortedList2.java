package LeetCodeQuestions;

public class Q85RemoveDuplicatesFromSortedList2 {
    public static ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        ListNode i = head;
        while(i != null){
            if(i.next == null || i.val != i.next.val){
               d.next = i;
               d = i;
               i = i.next;
            }else{
                ListNode j = i.next;
                while(j != null && j.val == i.val){
                    j = j.next;
                }
                i = j;
            }
        }
        d.next = i;
        return dummy.next;
    }

    static void main() {
        ListNode a = new ListNode(10); ListNode b = new ListNode(20);
        ListNode c = new ListNode(20); ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);  ListNode f = new ListNode(50);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        ListNode temp = deleteDuplicates(a);
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
