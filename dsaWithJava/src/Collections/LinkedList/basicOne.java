package Collections.LinkedList;

class Nodee{
    int val;
    Nodee next;
    Nodee(int val){
        this. val = val;
    }
}

class practice{
    Nodee head;
    void addAtHead(int val){
        Nodee temp = new Nodee(val);
        if(head == null) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    void insertAtIdx(int idx, int val){
        Nodee temp = head;
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        Nodee newNodee = new Nodee(val);
        newNodee.next = temp.next.next;
        temp.next = newNodee;

    }

    void display(){
        if(head == null) return;
        Nodee temp = head;
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
