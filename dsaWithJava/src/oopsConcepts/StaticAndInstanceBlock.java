package oopsConcepts;

class ex{
    static {
        System.out.println("I am the static block");
    }
    {
        System.out.println("I am the instance block");
    }

}


public class StaticAndInstanceBlock {
    public static void main(String[] args) {
        ex e = new ex();
        ex f = new ex();


    }
}