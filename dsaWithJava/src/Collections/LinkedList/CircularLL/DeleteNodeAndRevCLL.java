package Collections.LinkedList.CircularLL;


public class DeleteNodeAndRevCLL {
    static Node rev(Node head){
        Node dum = new Node(-1);
        Node curr = head;
        dum.next = head;
        Node prev = null;
        Node fwd;
        while(curr != head){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    static void main() {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(9);
        Node f = new Node(8);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next =a;

        Node res = rev(a);
        Node temp = a;
        while(temp.next != a){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val);

    }
}
