package ExceptionHandlingPractice;

class ExcClass extends Exception{
    String msg;
    ExcClass(String msg){
        this.msg = msg;
    }
    @Override
    public String toString(){
        return "this is the toString method";
    }
    public String getMessage(){
        return "i am the get message";
    }
}

public class ExceptionClass {
    static void main() {
        String s = "name";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rev = sb.reverse();
        if(rev.toString().equals(s)){

        }
        int a = 90;
        if(a == 90){
            try{
//               throw new ExcClass("i am const msg");
               throw new ArithmeticException("1. I am the arithmetic exception");
            }catch (Exception e){
                System.out.println("2. " + e.getMessage());
                System.out.println("3. " + e.toString() + "\n\"4. \" + ");
                e.printStackTrace();
            }
        }
    }
}
