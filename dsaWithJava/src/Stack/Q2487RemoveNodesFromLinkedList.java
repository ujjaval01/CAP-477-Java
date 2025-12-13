package Stack;

import java.util.Stack;

public class Q2487RemoveNodesFromLinkedList {
    static void main() {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(13);
        Node d = new Node(3);
        Node e = new Node(8);
        a.next = b; b.next = c; c.next = d; d.next = e;
        Node temp = removeNodes(a);
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
//    public static Node removeNodes(Node head) {
//        Stack<Integer> st = new Stack<>();
//        Node temp = head;
//        while (temp != null){
//            while(!st.isEmpty() && st.peek() < temp.val){
//                st.pop();
//            }
//            st.push(temp.val);
//            temp = temp.next;
//        }
//        Node newHead = null;
//        while (!st.isEmpty()){
//            Node a = new Node(st.pop());
//            a.next = newHead;
//            newHead = a;
//        }
//        return newHead;
//    }
    static Node rev(Node head){
        Node curr = head;
        Node prev = null;
        Node fwd;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public static Node removeNodes(Node head){
        if(head == null) return null;
        Node r = rev(head);
        Node i = r;
        Node j = r;
        while(j != null && j.next != null){
            if(j.next.val < i.val){
                j.next = j.next.next;
            }else{
                j = j.next;
                i = j;
            }
        }
        return rev(r);
    }
}

