package Collections.LinkedList;



public class GetMiddleElement {

    static int getMiddle(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i<count/2; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50); // Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; //e.next = f;
        int res = getMiddle(a);
        System.out.println(res);

    }
}
