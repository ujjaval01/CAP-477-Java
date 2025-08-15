package oopsConcepts;

interface Animal{
    void makeSound();
    void eat();
}


class Dog1 implements Animal{
    public void makeSound(){
        System.out.println("Dog make sound: BHO BHO");
    }
    public void eat(){
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
