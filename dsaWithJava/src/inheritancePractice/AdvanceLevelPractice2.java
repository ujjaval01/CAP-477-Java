package inheritancePractice;

interface A2{
    default void show() {
        System.out.println("I am from A2 interface");
    }
}
interface B2{
    default void show() {
        System.out.println("I am from B2 interface");
    }
}
class C2 implements A2,B2{

    public void show(){
        A2.super.show();
        B2.super.show();
    }
}
public class AdvanceLevelPractice2 {
    public static void main(String[] args) {
        C2 c = new C2();
        c.show();

    }
}
