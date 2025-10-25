package LeetCodeQuestions;

// LeetCode Question 2: Add Two Numbers

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Q2AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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

    // Helper function to print a linked list
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // l1 = [2,4,3]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // l2 = [5,6,4]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Q2AddTwoNumber sol = new Q2AddTwoNumber();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Expected Output: 7 -> 0 -> 8
        System.out.print("Result: ");
        printList(result);
    }
}
