package Collections.LinkedList;

import static Collections.LinkedList.DeleteMidNode.display;

public class getKthFromLast {
    static int getKthFromLast(Node head, int k) {
        // Your code here
        int count = 0;
        Node temp = head;
        while(temp!= null){
            count++;
            temp = temp.next;
        }

        if(k > count) return -1;


        temp = head;
        int range = count - k + 1;
        for(int i = 1; i<range; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    static void main() {
        Node a = new Node(10); Node b = new Node(20);
        Node c = new Node(30); Node d = new Node(40);
        Node e = new Node(50); Node f = new Node(60);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        display(a);
        int res = getKthFromLast(a, 2);
        System.out.println(res);
    }
}
