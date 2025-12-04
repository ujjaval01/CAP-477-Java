package ExceptionHandlingPractice;

public class first {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try{
            int res = a/b;
            System.out.println(res);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Always execute...");
        }
    }

}
