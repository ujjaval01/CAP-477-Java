package Collections.LinkedList.SinglyLL;


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
    void insert(int idx, int val){
        if(idx<0 || idx > size()){
            System.out.println("Invalid Index...");
        }
        Node temp = head;

        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;
    }
    void deltAtHead(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        if(head == tail) {
            head = tail = null;
            System.out.println("List is empty...");
            return;
        }
        head = head.next;
    }
    void deltAtTail(){
        Node temp = head;
        if(size() == 0){
            System.out.println("Node is empty..");
        } else if (size() == 1) {
            head = tail = null;
        }else{
            while(temp != tail){
                temp = temp.next;
                if(temp.next == tail){
                    tail = temp;
                    tail.next = null;
                    return;
                }
            }
        }
    }
    void delete(int idx){
        if(idx<0 || idx > size()){
            System.out.println("Invalid Index...");
        }else if(idx == 0) deltAtHead();
        else if (idx == size()-1) deltAtTail();
        else {
            Node temp = head;
            for(int i = 0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

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
//        ll.insert(2,100);
//        ll.display();
//        ll.delete(2);
//        ll.display();

    }
}
