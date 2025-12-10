package LinkedList.DoublyLL;

public class deletionByValue {

    static Node deleteByValue(Node head, int val) {
        // Empty list
        if (head == null) return null;

        Node temp = head;

        // Case 1: If the value is in the head
        if (temp.val == val) {
            head = head.next;       // Move head
            if (head != null) head.prev = null;  // Fix prev pointer
            return head;
        }

        // Traverse and find the node to delete
        while (temp != null) {
            if (temp.val == val) {
                Node previous = temp.prev;
                Node next = temp.next;

                // If deleting last node
                if (next == null) {
                    previous.next = null;
                    return head;
                }

                // If deleting middle node
                previous.next = next;
                next.prev = previous;

                return head;
            }
            temp = temp.next;
        }

        // Value not found
        return head;
    }


    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;

        Node head = a;

        System.out.println("Before deletion:");
        print(head);

        head = deleteByValue(head, 30);

        System.out.println("After deletion:");
        print(head);
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

