package Collections.LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedListt{
    // By default Null....
    Node head;
    Node tail;

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }

    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
    }
    int get(int idx){
        Node temp = head;
        int res = 0;
        for(int i = 0; i<=idx; i++){
            res = temp.val;
            temp = temp.next;
        }
        return res;
    }
    int size(){
        Node temp = head;
        int count = 0;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }





    void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class OwnLinkedListDataStructure {
    static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.addAtHead(20);
        ll.addAtHead(30);
        ll.addAtHead(40);
        ll.addAtHead(50);
        ll.display();
        ll.addAtTail(10);
        ll.addAtTail(70);
        ll.display();
        System.out.println(ll.get(2));
        System.out.println(ll.size());

    }
}
