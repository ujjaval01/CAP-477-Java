package ExceptionHandlingPractice;

class myException extends Exception{
    public myException(String msg){
        super(msg);
    }
}

public class CustomException {
    static void main() {
        try{
            throw new myException("This is my custom exception...");
        }catch (myException e){
            System.out.println("Catch: " + e.getMessage());
        }
    }
}
