package inheritancePractice;

// Multilevel inheritance   superClass -> subClass1 -> subClass2 -> subClass3
// Multiple inheritance(Java does not support, but we can archive using interface(abstract class))   superClass   superClass
//                                                                                                           \       /
//                                                                                                            \     /
//                                                                                                            SubClass
class A{
    int value = 10;
    String name = "A";
    void show(){
        System.out.println("my name is " + name);
    }
}

class B extends A{
    String color = "black";
    void show2(){
        System.out.println("My value is " + value);
    }
}
class C extends B{
    void show3(){
        System.out.println("my color is " + color);
    }

}


public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show2();
        obj.show3();

    }
}
