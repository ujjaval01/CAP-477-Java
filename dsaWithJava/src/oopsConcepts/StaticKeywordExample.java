package oopsConcepts;

class StaticExample{
    public static void info(){
        System.out.println("I am the static method");
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        StaticExample s = new StaticExample();
        s.info();
        StaticExample.info();

    }
}
