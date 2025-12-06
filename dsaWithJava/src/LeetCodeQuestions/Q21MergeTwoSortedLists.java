package LeetCodeQuestions;

//import Collections.LinkedList.ListNode;

public class Q21MergeTwoSortedLists {
    static ListNode sortedMerge(ListNode a, ListNode b) {
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
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(30);
        ListNode c = new ListNode(40);
        ListNode d = new ListNode(60);
        ListNode e = new ListNode(90);
        a.next = b; b.next = c; c.next = d; d.next = e;
        ListNode o = new ListNode(20);
        ListNode p = new ListNode(50);
        ListNode q = new ListNode(70);
        ListNode r = new ListNode(80);
        o.next = p; p.next = q; q.next = r;


        ListNode res = sortedMerge(a, o);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
