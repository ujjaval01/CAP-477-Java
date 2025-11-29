package Collections.LinkedList;

class getMiddleEle{
    Node head;
    int getMiddle(){
        Node temp = head;
        int count = 0;
        while(head != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i<count/2; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}

public class gfgGetMiddleElement {
    static void main() {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        getMiddleEle g = new getMiddleEle();
        g.getMiddle();


    }
}
