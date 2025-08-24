package ExceptionHandlingPractice;

class ExcClass extends Exception{
    @Override
    public String toString(){
        return "this the is the toString method";
    }
    public String getMessage(){
        return "i am the get message";
    }
}

public class ExceptionClass {
    static void main() {
//        ExcClass e = new ExcClass();
//        System.out.println(e.toString());
        int a = 10;
        if(a < 90){
            try{
               throw new ExcClass();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
