package ExceptionHandlingPractice;

public class ExceptionPractice {
    static void main() throws Exception {
        int a = 9;
        int b = 3;
        int[] arr = {1,2,3};
        try{
            int result = a /b;
            System.out.println("nona babu");
            try{
                int c = arr[4];
            }catch (Exception f){
                System.out.println(f);
            }finally {
                System.out.println("i am the inside finally block");
            }
        }catch(Exception e){
            System.out.println(e);
            throw new Exception("i am throw vali exception...");

        }finally {
//            assert System.out != null;
            System.out.println("i am finally block...");
        }
    }

}
