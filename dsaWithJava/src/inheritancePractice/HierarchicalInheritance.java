package inheritancePractice;

// Hierarchical Inheritance:- Multiple subClasses inherit from a single class   SuperClass
//                                                                               /  \
//                                                                              /    \
//                                                                             /      \
//                                                                        subClass1 subClass2
class A1{
    protected int value = 10;
    String name = "A";
    void show(){
        System.out.println("my name is " + name);
    }
}

class B1 extends A1{
    String color = "black";
    void show2(){
        System.out.println("my color is " + color);
    }
}
class C1 extends A1{
    void show3(){
        System.out.println("My value is " + value);
    }

}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show2();
        obj.show3();

    }
}
