package LeetCodeQuestions;

public class Q2130MaximumTwinSumOfALinkedList {
    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b;
    }
    public static int isPalindrome(ListNode head){
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
        int max = 0;
        while(j != null){
            int sum = i.val + j.val;
            if(sum > max){
                max = sum;
            }
            i = i.next;
            j = j.next;
        }
        return max;
    }
    public static int pairSum(ListNode head) {
        ListNode temp = head;
        return isPalindrome(temp);
    }
    static void main() {
        ListNode a = new  ListNode(10);
        ListNode b = new  ListNode(20);
        ListNode c = new  ListNode(30);
        ListNode d = new  ListNode(20);
        ListNode e = new  ListNode(10);
        a.next = b; b.next = c; c.next = d; d.next = e;
        System.out.println(pairSum(a));

    }
}
