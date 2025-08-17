package inheritancePractice;

class first{
    void fun1(){
        System.out.println("i am the first class fun1");
    }
}

class second extends first{
    void fun1(){
        super.fun1();              // calling the super class function
        System.out.println("I am the second class fun1");
    }
    void fun2(){
        System.out.println("i am the second class fun2");
    }
}

public class MethodOverridingInInheritance{
    public static void main(String[] args){

        first f = new first();
        f.fun1();

        second s = new second();
        s.fun1();


    }
}