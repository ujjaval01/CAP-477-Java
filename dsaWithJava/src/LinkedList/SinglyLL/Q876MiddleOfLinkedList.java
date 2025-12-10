package LinkedList.SinglyLL;



class Solution {

    // ------- Leetcode 66: PLUS ONE --------
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--){

            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }


    // ------- Middle Node (Fast-Slow Pointer) --------
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // ------- Swap Nodes in Pairs --------
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;
        }

        return dummy.next;
    }

    // ------- Return Middle Value Using Count --------
    public int getMiddle(ListNode head){
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        temp = head;
        for(int i = 0; i < count/2; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}



public class Q876MiddleOfLinkedList {
    public static void main(String[] args) {

        Solution s = new Solution();

        // -------- LinkedList Setup --------
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        System.out.println("Middle Value = " + s.getMiddle(a));

        System.out.print("Middle Node (Fast-Slow): ");
        System.out.println(s.middleNode(a).val);

        System.out.print("Swap Pairs Output: ");
        ListNode swapped = s.swapPairs(a);
        while(swapped != null){
            System.out.print(swapped.val + " ");
            swapped = swapped.next;
        }
        System.out.println();


        // -------- Plus One Testing --------
        int[] arr = {9,9,9};

        int[] ans = s.plusOne(arr);

        System.out.print("\nPlus One Result: ");
        for(int x : ans){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
