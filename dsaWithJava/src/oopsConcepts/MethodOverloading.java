package oopsConcepts;

public class MethodOverloading {
    

    static int cal(int a, int b){
        return a + b;
    }

    double cal(double a, double b, double c){
       double result = (a * b)/c; 
       return result;
    }

    static void tellJokes(){
        System.out.println("i am static method");
    }

    void tellJokes1(){
        System.out.println("i am non static method");
    }

    public static void main(String[] args) {
        System.out.println("Starting of the program");
        tellJokes();
        MethodOverloading obj = new MethodOverloading();
        obj.tellJokes1();
        System.out.println(obj.cal(10, 05, 3) * 3);
        int result = cal(5, 07);
        System.out.println(result);
        
    }



}
