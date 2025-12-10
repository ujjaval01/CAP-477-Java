package Collections.LinkedList.SinglyLL;

public class Q160IntersectionOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int len1 = 0;
        ListNode temp1 = head1;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }
        int len2 = 0;
        ListNode temp2 = head2;
        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;

        if(len1 > len2){
            for(int i = 1; i<=len1-len2; i++){
                temp1 = temp1.next;
            }
        }else{
            for(int i = 1; i<=len2-len1; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;

    }

    static void main() {
        // ----- Create common intersection nodes -----
        ListNode common1 = new ListNode(8);
        ListNode common2 = new ListNode(4);
        ListNode common3 = new ListNode(5);

        common1.next = common2;
        common2.next = common3;

        // ----- First Linked List: 10 -> 20 -> 30 -> 40 -> 50 -----
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        a1.next = a2;
        a2.next = common1;

        // ----- Second Linked List: 5 -> 30 -> 40 -> 50 -----
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        b1.next = b2;
        b2.next = b3;
        b3.next = common1;


        // ----- Find intersection -----
        ListNode ans = getIntersectionNode(a1, b1);

        if(ans != null){
            System.out.println("Intersection Node: " + ans.val);
        } else {
            System.out.println("No intersection found");
        }
    }
}
