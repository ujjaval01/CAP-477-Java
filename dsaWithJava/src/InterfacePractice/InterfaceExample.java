package InterfacePractice;

interface Animal{
    void makeSound();
    void eat();
}


class Dog1 implements Animal{
    public void makeSound(){
        System.out.println("Dog make sound: BHO BHO");
    }
    private void greet(){
        System.out.println("hello");         // we can't direct access private method, but using like this we can...
    }
    public void eat(){
        greet();                             // like thiss
        System.out.println("Dog eat: BONES");
    }
}
class Cat1 implements Animal{
    public void makeSound(){
        System.out.println("Cat make sound: MEW MEW");
    }
    public void eat(){
        System.out.println("Cat eat: RATS");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog1();
        dog.makeSound();
        dog.eat();

        Animal cat = new Cat1();
        cat.makeSound();
        cat.eat();

    }
}
