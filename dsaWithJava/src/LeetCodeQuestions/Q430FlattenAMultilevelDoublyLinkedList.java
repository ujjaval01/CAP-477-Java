package LeetCodeQuestions;

public class Q430FlattenAMultilevelDoublyLinkedList {
    public ListNode flatten(ListNode head) {
        if(head == null) return null;
        ListNode curr = head;
        while(curr != null){
            if(curr.child == null) curr = curr.next;
            else{
                ListNode fwd = curr.next;
                ListNode c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                ListNode temp = c;
                while(temp.next != null) temp = temp.next;
                temp.next = fwd;
                if(fwd != null) fwd.prev = temp;
                curr = fwd;
            }
        }
        return head;
    }
    static void main() {

    }
}
