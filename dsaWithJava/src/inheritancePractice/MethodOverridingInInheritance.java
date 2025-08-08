class first{
    void fun1(){
        System.out.println("i am the first class fun1");
    }
}

class second extends first{
    void fun1(){
        System.out.println("I am the second class fun1");
    }
       void fun2(){
        System.out.println("i am the second class fun2");
    }
}
    
//    practice another question
//class Student{
//    int rollNo;
//    String name;
//
//    boolean printInfo(){
//        System.out.println("the name of the student is " + name);
//        System.out.println("the roll no of the student is " + rollNo);
//        return false;
//    }
//
//}


public class MethodOverridingInInheritance{
    public static void main(String[] args){

        // practice another question
//        Student st1 = new Student();
//        st1.rollNo = 11;
//        st1.name = "Ujjaval";
//
//        System.out.println(st1.printInfo());


        first f = new first();
        f.fun1();

        second s = new second();
        s.fun1();


    }
}