package AbstractionPractice;

abstract class abs{
    void sayHello(){
        System.out.println("Hello");
    }
    abstract public void namaste();
}

class abs2 extends abs{
    @Override
    public void namaste(){
        System.out.println("Namaste...");
    }
}

public class AbsClass2 {
    public static void main(String[] args) {
        abs2 ab = new abs2();
//        abs a = new abs();      // ---> through error, we can't create direct obj of the abstract class
        abs a = new abs() {// ---> second method to do...
            @Override
            public void namaste() {
                System.out.println("namaste jii...");
            }
        };
         a.namaste();
        ab.namaste();
    }
}
