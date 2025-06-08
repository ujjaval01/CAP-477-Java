public class swaping {

    public static void main(String[] args) {
        int a = 50;
        int b = 90;
        System.out.println("original value of a = " + a);
        System.out.println("original value of b = " + b);
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // int temp = a;
        // a = b;
        // b = temp;
        
        a = a + b; // 10+20= 30
        b = a - b; // 30-20= 10
        a = a - b;  // 30-10 = 20 
        
        System.out.println("after swaping value of a = " + a);
        System.out.println("after swaping value of b = " + b);
        
    }
}
    

