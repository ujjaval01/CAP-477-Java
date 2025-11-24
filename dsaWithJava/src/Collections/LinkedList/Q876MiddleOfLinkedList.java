package Collections.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class Q876MiddleOfLinkedList {
    static void main() {
        Solution s = new Solution();
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode n = s.middleNode(a);
        ListNode temp = n;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
        System.out.println();


    }
}
