package LinkedList.SinglyLL;

public class MergeTwoSortedList {
    static Node sortedMerge(Node a, Node b) {
        Node i = a;
        Node j = b;
        Node d = new Node(-1);
        Node k = d;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i == null) k.next = j;
        else k.next = i;
        return d.next;
    }
    public static void main(String[] args){
    Node a = new Node(10);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(60);
        Node e = new Node(90);
        a.next = b; b.next = c; c.next = d; d.next = e;
        Node o = new Node(20);
        Node p = new Node(50);
        Node q = new Node(70);
        Node r = new Node(80);
        o.next = p; p.next = q; q.next = r;


        Node res = sortedMerge(a, o);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
