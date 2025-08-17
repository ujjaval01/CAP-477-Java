package InterfacePractice;
//this is the comment
interface SampleInterface{
    void fun1();
    void fun2();
}
interface SampleInterface2 extends SampleInterface{
    void fun3();
    void fun4();
}

class SampleClass implements SampleInterface2{
    @Override
    public void fun1() {
        System.out.println("Fun1");
    }
    @Override
    public void fun2() {
        System.out.println("Fun2");
    }
    @Override
    public void fun3() {
        System.out.println("Fun3");
    }
    @Override
    public void fun4() {
        System.out.println("Fun4");
    }
    void all(){
        fun1();
        fun2();
        fun3();
        fun4();
    }
}


public class InterfaceWithExtends {
    public static void main(String[] args) {
        SampleClass s = new SampleClass();
        s.all();
    }
}
