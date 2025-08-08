package inheritancePractice;

class Base{
    int x;
    Base(){
        System.out.println("I am the base class constructor");
    }
    Base(int x, int y){
        System.out.println("I am the overloaded base class constructor " + x + " " + y);
    }
}

class Derived extends Base{
    int y;
    Derived(){
        System.out.println("I am the derived class constructor");
    }
    Derived(int z){
        super(0,3);
        System.out.println("I am the overloaded derived class constructor " + z);
    }
}

class exDerived extends Derived{
    int y;
    exDerived(){
        super(5);
        System.out.println("this is the exDerived constructor");
    }

}




public class PracticeSecond {
    public static void main(String[] args) {
        // Base b = new Base();
        exDerived e = new exDerived();



        
    }
}
