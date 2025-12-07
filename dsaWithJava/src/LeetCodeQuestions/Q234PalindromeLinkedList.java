package LeetCodeQuestions;

import java.util.ArrayList;

public class Q234PalindromeLinkedList {
    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b;
    }
    public static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        while(j != null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
//    public static boolean isPalindrome(ListNode head) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        ListNode temp = head;
//        while(temp != null){
//            arr.add(temp.val);
//            temp = temp.next;
//        }
//        int n = arr.size();
//        int i = 0, j = n-1;
//        while(i<j){
//            if(arr.get(i) != arr.get(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
    static void main() {
        ListNode a = new  ListNode(10);
        ListNode b = new  ListNode(20);
        ListNode c = new  ListNode(30);
        ListNode d = new  ListNode(20);
        ListNode e = new  ListNode(10);
        a.next = b; b.next = c; c.next = d; d.next = e;
        System.out.println(isPalindrome(a));

    }
}
