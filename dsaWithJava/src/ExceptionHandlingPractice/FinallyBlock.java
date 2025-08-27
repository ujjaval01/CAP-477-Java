package ExceptionHandlingPractice;

public class FinallyBlock {
    static void main() {
        int a = 8, b = 0;
        try{
            int c = a / b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        } {
            System.out.println("HII, I am always executed finally block...");
        }
    }

}
