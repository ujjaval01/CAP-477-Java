//note: - (1). if a class has single one abstract method, then the class called abstract class
//        (2). whenever the action is different and the implementation are same, that time we are using the abstract classes

/*
1. abstraction class can contain abstract and non-abstract method also
2. it can contain static and instance block also


*/

package AbstractionPractice;
abstract class Animals1{
    static {         // 2.they can contain static methods(run only once when the class load) also
        System.out.println("They has 4 lags");
    }
    {                // they can contain instance block(run every time when the object created) also
        System.out.println("hello");
    }

    void walkAndRun(){                          // 3.they can contain non-abstract methods also
        System.out.println("they can walk as well as run also");
    }
    abstract void sound();                      // abstract method
    abstract void eat();                        // abstract method

}

class Dog11 extends Animals1{
    @Override
    void sound(){          // overridden abstract method, with method body
        System.out.println("the dogs are sounds likes BHO BHO..");
    }

    void eat(){              // overridden abstract method, with method body
        System.out.println("The dogs are eat bones");
    }
}
class Cow extends Animals1{
    void sound(){              // overridden abstract method, with method body
        System.out.println("the cow are sounds likes Mah Mah..");
    }
    void eat(){              // overridden abstract method, with method body
        System.out.println("The cows are eat grass");
    }
}


class AbsClass{
    public static void main(String[] args) {
        // Animals1 a = new Animals1();           4. we can not create object of abstract class
        Dog11 d = new Dog11();
        Cow c = new Cow();

        d.eat(); d.sound();
        c.eat(); c.sound();

    }
}