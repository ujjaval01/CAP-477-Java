package LeetCodeQuestions;

public class Q2AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
    static void main() {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b; b.next = c;
        ListNode o = new ListNode(5);
        ListNode p = new ListNode(6);
        ListNode q = new ListNode(4);
        o.next = p; p.next = q;
        ListNode res = addTwoNumbers(a, o);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
