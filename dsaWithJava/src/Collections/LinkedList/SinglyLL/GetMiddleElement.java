package Collections.LinkedList.SinglyLL;
public class GetMiddleElement {
//    static int getMiddle(Node head){
//        Node temp = head;
//        int count = 0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        temp = head;
//        for(int i = 0; i<count/2; i++){
//            temp = temp.next;
//        }
//        return temp.val;
//    }

    // slow and fast approach....
    static int getMiddle(Node head){
        Node temp = head;
        Node temp2 = head;
        // If only 1 node or empty list
        if(head == null || head.next == null){
            return -1;
        }
        while(temp != null && temp.next != null){
            temp = temp.next.next;
            temp2 = temp2.next;
        }
        return temp2.val;
    }


    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50);  Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        int res = getMiddle(a);
        System.out.println(res);

    }
}
