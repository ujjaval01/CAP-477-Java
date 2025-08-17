package packagePractice2;
import packagePractice1.simple;

class simpleSecond extends simple {
    protected void show(){
        System.out.println(simple.a);
    }
}

public class simple2{
    public static void main(String[] args) {
        simpleSecond s = new simpleSecond();
        s.show();
    }
}
