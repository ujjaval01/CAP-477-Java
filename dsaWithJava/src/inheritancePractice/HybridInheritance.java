package inheritancePractice;

class Animalss{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dogg extends Animalss{                       // single inheritance
    void bark(){
        System.out.println("Barking...");
    }
}

// creating interface for archiving multiple inheritance

interface Guard{
    void guard();
}
interface Pet{
    void play();
}

class GermanShepherd extends Dogg implements Guard,Pet{
    @Override
    public void guard() {
        System.out.println("Guarding...");
    }
    @Override
    public void play() {
        System.out.println("Playing...");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        GermanShepherd g = new GermanShepherd();
        g.eat();
        g.bark();
        g.guard();
        g.play();

    }
}
