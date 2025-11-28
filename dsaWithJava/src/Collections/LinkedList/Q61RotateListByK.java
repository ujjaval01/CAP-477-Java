package Collections.LinkedList;
class Solution3 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        // 1️⃣ Calculate length and get last node
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        // 2️⃣ Make it circular
        temp.next = head;

        // 3️⃣ Find effective rotation
        k = k % length;
        int stepsToNewHead = length - k;

        // 4️⃣ Move `temp` to the new last node
        while(stepsToNewHead-- > 0){
            temp = temp.next;
        }

        // 5️⃣ Break the circle and return new head
        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}


public class Q61RotateListByK {
    static void main() {

    }
}
