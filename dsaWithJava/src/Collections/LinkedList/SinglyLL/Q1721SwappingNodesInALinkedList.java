package Collections.LinkedList.SinglyLL;

public class Q1721SwappingNodesInALinkedList {
    public static ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        for(int i = 1; i<k; i++){
            temp1 = temp1.next;
        }
        ListNode temp2 = head;
        for(int j = 1; j<= count-k; j++){
            temp2 = temp2.next;
        }
        int swap = temp1.val;
        temp1.val = temp2.val;
        temp2.val = swap;

        return head;
    }
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void main() {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        display(a);
        swapNodes(a, 2);
        display(a);




    }
}
