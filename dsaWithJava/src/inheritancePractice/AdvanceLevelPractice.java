package inheritancePractice;

abstract class Shape{
    abstract void draw();
    Shape(){
        draw();
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("i am the draw method");
    }
}


public class AdvanceLevelPractice {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.draw();

    }
}
