package ExceptionHandlingPractice;

public class FinallyBlock {
    static void main() {
        int a = 8, b = 0;
        try{
           if(b == 0){
               throw new IllegalArgumentException("I am illegal exception");
           }
        } catch(IllegalArgumentException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("HII, I am always executed finally block...");
        }
    }

}
