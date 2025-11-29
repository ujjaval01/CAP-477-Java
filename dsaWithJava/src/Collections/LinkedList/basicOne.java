package Collections.LinkedList;

class practice{
    Node head;
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    void insertAtIdx(int idx, int val){
        Node temp = head;
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        Node newNodee = new Node(val);
        newNodee.next = temp.next.next;
        temp.next = newNodee;

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
}

public class basicOne {
    static void main() {
        practice p = new practice();
        p.addAtHead(10);
        p.addAtHead(20);
        p.addAtHead(30);
        p.addAtHead(40);
        p.display();
        p.insertAtIdx(2, 100);
        p.display();


    }
}
