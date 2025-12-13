package Stack;

class MyStack{
    Node head;
    int len;

    // push pop peek size
    void push(int val) throws Exception{
        Node temp = new Node(val);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    void pop() throws Exception{
        if(head == null){
            throw new Exception("Stack Underflow Exception");
        }
        int x = head.val;
        head = head.next;
        len--;
    }
    int peek() throws Exception{
        if(head == null){
            throw new Exception("Stack Underflow Exception");
        }
        return head.val;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class OwnStackImplementation {
    static void main() throws Exception {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.size());
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.size());

        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());





    }
}
