package LeetCodeQuestions;

import java.util.ArrayList;

public class Q234PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int n = arr.size();
        int i = 0, j = n-1;
        while(i<j){
            if(arr.get(i) != arr.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
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
