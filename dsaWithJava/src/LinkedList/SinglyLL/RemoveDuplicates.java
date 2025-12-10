package LinkedList.SinglyLL;

public class RemoveDuplicates {
    static Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head;
        while(j != null){
            if(i.val == j.val) j = j.next;
            else{
                i.next = j;
                i = j;
            }
        }
        i.next = null;
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(20); Node d = new Node(40);
        Node e = new Node(50);  Node f = new Node(50);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        removeDuplicates(a);
        display(a);

    }
}
