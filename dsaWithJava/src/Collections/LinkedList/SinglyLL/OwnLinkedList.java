package Collections.LinkedList.SinglyLL;

import java.util.ArrayList;
import java.util.List;

/* deleteAtIndex () () ()*/

class Linkedlist{
    Node head;  // In java by default Null
    Node tail; // In java by default Null

    void addAtIndex(int idx, int val){
        if(idx == 0){
            addAtHead(val);
            return;
        }
        if(idx == size()){
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;



    }
    void deltAtIdx(int idx){




    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }
    void addAtIdx(int val){
        Node temp = new Node(val);

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
    int get(int idx) {  // 0 based Indexing....
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    int size(){  // 0 Based indexing
        Node temp = head;
        int count= 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void demo(int val){
        Node temp = new Node(val);
        temp = temp.next;

    }
}
public class OwnLinkedList {
    static void main() {
        List<Integer> l = new ArrayList<>();

        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30); ll.addAtTail(40);
//        ll.addAtHead(40);  //ll.display();
//        System.out.println(ll.head);
//        System.out.println(ll.tail);
//        ll.addAtTail(20);
//        ll.addAtTail(30);  ll.display();
//        ll.addAtHead(50);  ll.display();
//        System.out.println(ll.size());
//        ll.deltAtHead(); (2));
//        System.out.println(ll.size());
//        System.out.println(ll.size());
//        ll.display();
////        ll.deltAtTail();
//        ll.addAtIndex(2, 90);
//        ll.display();





    }
}
