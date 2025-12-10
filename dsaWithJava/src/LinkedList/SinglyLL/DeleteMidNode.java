package LinkedList.SinglyLL;
/*GFG
Given a singly linked list, delete the middle of the linked list.
Note:
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
If the input linked list has a single node, then it should return NULL.
Examples:
1. Input: LinkedList: 1->2->3->4->5
Output: 1->2->4->5
2. Input: LinkedList: 2->4->6->7->5->1
Output: 2->4->6->5->1*/

public class DeleteMidNode {
    public static Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head == null || head.next == null) return null;

        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int mid = count/2;

        for(int i = 0; i<mid-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50); Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        display(a);
        deleteMid(a);
        display(a);

    }
}
