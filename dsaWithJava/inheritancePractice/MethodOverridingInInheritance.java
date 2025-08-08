class first{
//    first(){
//        System.out.println("i am the constructor of the first class");
//    }
    void fun1(){
        System.out.println("i am the first class fun1");
    }
}

class second extends first{
//    second(){
//        System.out.println("i am the constructor of the second class");
//    }
    @Override
    void fun1(){
        System.out.println("i am the second class fun1");
    }void fun2(){
        System.out.println("i am the second class fun2");
    }
}


public class MethodOverridingInInheritance{
    public static void main(String args[]){

        second s = new second();
        s.fun1();


    }
}