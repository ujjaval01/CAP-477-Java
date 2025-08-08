package simpleExamples;

public class Conditions {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 10 -> System.out.println("the value of a is 10");
            case 20 -> System.out.println("the value of a is 20");
            case 30 -> System.out.println("the value of a is 30"); 
            default -> System.out.println("this is default");
        }
    }
}
