package inheritancePractice;

interface x{
    int a = 20;
    String name = "ujvl";
    default void game(){
        System.out.println("i am playing the game " + name);
    }
}
interface y{
    int b = 10;
    String name = "Aadi";
    default void study(){
        System.out.println("i am doing study " + name);
    }
}
class z implements x,y {

    void display(){
        x.super.game();
        y.super.study();
    }
}
class w extends z{
    void value(){
        System.out.println("the value of a is: " + a);
    }
}


public class multipleInheritance {
    public static void main(String[] args) {
        w obj = new w();
        obj.display();
        obj.value();

    }
}
