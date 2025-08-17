package polymorphismPractice.compileTimePoly;

/* POLYMORPHISM:- Ek hi method ya reference k alg alg behaviour hona, depending on object type and argument
 For interview:-Polymorphism is allowed us to perform a single task in different ways
 hum is program ko polymorphism se v relate kr skte hai, quki polymorphism 2 types ke hote h
  1. compile time polymorphism(method overloading)
  2. Run time polymorphism(method overriding)

  compile time polymorphism(method overloading) me jub code compile hota h, tub java compiler decide karta h kon sa
  method compile hoke run hoga
 */

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
        tellJokes();           // no need to create obj due to static method
        MethodOverloading obj = new MethodOverloading();
        obj.tellJokes1();      // need to create obj due to non-static method
        System.out.println(obj.cal(10, 05, 3) * 3);
        int result = cal(5, 07);
        System.out.println(result);
        
    }



}
