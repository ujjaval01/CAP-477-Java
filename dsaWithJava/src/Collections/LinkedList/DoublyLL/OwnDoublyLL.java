package Collections.LinkedList.DoublyLL;
class Node{
    int val;
    Node next;
    Node prev;

    Node(int val){
        this.val = val;
    }
}
class DLL{
    Node head;
    Node tail;
    int size;
    public void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
           temp.next = head;
           head.prev = temp;
           head = temp;
        }
        size++;
    }
    public void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    public void deleteAtHead(){
        if(head == null){
            System.out.println("List is already empty...");
            return;
        }else if(head.next == null){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
}
public class OwnDoublyLL {
    static void main() {
        DLL a = new DLL();
        a.insertAtHead(50);
        a.insertAtHead(40);
        a.insertAtHead(30);
        a.insertAtHead(20);
        a.insertAtTail(10);
        System.out.println("Size: " + a.size);
        System.out.print("Full list: "); a.display();
        System.out.print("Full Rev list: "); a.displayRev();
//        a.deleteAtHead(); System.out.print("After deletion on head, list: "); a.display();
//        a.deleteAtTail(); System.out.print("After deletion on tail, list: "); a.display();
//        a.insertAtIdx(2, 70);
//        a.display();
//        System.out.println(a.size);


    }
}
