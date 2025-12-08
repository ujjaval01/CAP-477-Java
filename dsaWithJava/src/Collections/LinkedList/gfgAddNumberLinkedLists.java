package Collections.LinkedList;

public class gfgAddNumberLinkedLists {
    public static Node rev(Node head){
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public static Node addTwoLists(Node head1, Node head2) {
        Node l1 = rev(head1);
        Node l2 = rev(head2);
        Node dummy = new Node(0);
        Node current = dummy;
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
            current.next = new Node(sum % 10);
            current = current.next;
        }
        Node res = rev(dummy.next);
        while(res != null){
            if(res.val == 0) res = res.next;
            else{
                break;
            }
        }
        return res;
    }
    static void main() {
//           1 2 3
//       + 9 5 7 8
//      ------------
//         9 7 0 1

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b; b.next = c;
        Node o = new Node(9);
        Node p = new Node(5);
        Node q = new Node(7);
        Node r = new Node(8);
        o.next = p; p.next = q; q.next = r;
        Node res = addTwoLists(a, o);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }

    }
}
