package Collections.LinkedList.CircularLL;


public class DeleteNodeAndRevCLL {
//    static Node rev(Node head){
//        if(head == null || head.next == null) return head;
//        Node curr = head;
//        Node prev = null;
//        Node fwd;
//        do{
//           fwd = curr.next;
//           curr.next = prev;
//           prev = curr;
//           curr = fwd;
//        }while (curr != head);
//        head.next = prev;
//        return prev;
//    }
static Node rev(Node head){
    Node tail = head;
    while(tail.next != head){
        tail = tail.next;
    }

    Node curr = head;
    Node prev = null;
    Node fwd;
    while(curr != tail){
        fwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fwd;
    }
    curr.next = prev;
    prev = curr;
    return prev;
}
    static Node deleteNode(Node head, int key) {
        if(head == null) return null;
        Node temp = head;
        if(head.val == key){
            if(head.next == head){
                return null;
            }
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return head;
        }

        temp = head;
        while(temp.next != head){
            if(temp.next.val == key){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }


    static void main() {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(9);
        Node f = new Node(8);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next =a;

        int k = 9;
        Node del = deleteNode(a, k);
        Node temp = rev(del);
        do{
            System.out.print(temp.val + " ");
            temp = temp.next;
        }while (temp != a);

    }
}
