package genericPractice;

public class GenericMethods {
    static void main() {
       printName("Ujvl", 55);
    }

    public static <T> void printName(T name,T id){
        System.out.println(name);
        System.out.println(id);
    }

}
