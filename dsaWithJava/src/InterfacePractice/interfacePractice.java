package InterfacePractice;
// Isme maine kya-kya kar diya mujhe hi nhi pta, but sb working h, understanding nd expremental h...
//combination of class + interface + abstract
// hybrid inheritance
//Archive multiple inheritance using interface
abstract class exp{
    void experiment(){
        System.out.println("Experiment is successfully");
    }
    abstract void BigHorns();
}

interface vehicle1 {
    String name = "TVS";                          // public + static + final
    int maxSpeed = 100;                            // public + static + final
    private void greet(){
        System.out.println("Namaste India");
    }default void username(String username){
        greet();                                    // accessing private method inside the interface(technologiya😄)
        System.out.println("i am " + username);
    }

    void start();
    void stop();

}
interface vehicle2 {
    String name = "HERO";
    int maxSpeed = 120;

    void start2();
    void stop2();
}

class mechanic1 extends exp {
    void checkUp(){
        System.out.println("The vehicle is totally fine " + vehicle1.name);
        System.out.println("The vehicle max speed is: " + vehicle1.maxSpeed);
    }
    @Override
    void BigHorns(){
        System.out.println("Poo Poo Poo Poo");
    }
}
class mechanic2 extends mechanic1 {
    void checkUp2(){
        System.out.println("The vehicle is totally fine " + vehicle2.name);
        System.out.println("The vehicle max speed is: " + vehicle2.maxSpeed);

    }
}

class Customer extends mechanic2 implements vehicle1,vehicle2 {

    @Override
    public void experiment(){
        super.experiment();
        System.out.println("i am overridden method");
    }

    @Override
    public void username(String username) {
        vehicle1.super.username(username);
        System.out.println("my name is " + username);
    }

    @Override
    public void start(){
        System.out.println("Push the button...");
    }
    @Override
    public void stop() {
        System.out.println("Remove the key...");
    }@Override
    public void start2(){
        System.out.println("insert the key & Push the button...");
    }
    @Override
    public void stop2() {
        System.out.println("push the button & Remove the key...");
    }
}

public class interfacePractice {
    public static void main(String[] args) {
        Customer c = new Customer();
//        vehicle1.maxSpeed = 220;  // we can't change the value of the final variable
        c.start(); c.stop();
        c.checkUp(); c.experiment();
        c.BigHorns();
        System.out.println("-------------------------------------------");
        c.start2(); c.stop2();
        c.checkUp2(); c.experiment();
        c.BigHorns();
        System.out.println("-----------------------------------");
        c.username("Ujjaval");


    }
}
