package staticKeyword;

// if we declare any method static, then we don't need to make the object of it

class StaticExample{
    public static void info(){
        System.out.println("I am the static method");
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        StaticExample s = new StaticExample();
        s.info();                        // making object and calling
        StaticExample.info();           // without making object and calling - class name with the dot operator

    }
}
