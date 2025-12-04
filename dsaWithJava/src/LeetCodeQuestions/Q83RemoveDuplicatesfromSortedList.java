package LeetCodeQuestions;

import java.util.List;

public class Q83RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        while(j != null){
            if(i.val == j.val) j = j.next;
            else{
                i.next = j;
                i = j;
            }
        }
        if(head != null) i.next = null;
        return head;
    }
    static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
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
        System.out.println();
//        display(a);
    }
}
