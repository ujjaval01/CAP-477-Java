package inheritancePractice;
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


public class HierarchicalInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show2();
        obj.show3();

    }
}
