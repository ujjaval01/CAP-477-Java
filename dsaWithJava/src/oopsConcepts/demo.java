package oopsConcepts;

class stud{
    String name;
    stud(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name);
    }
}
public class demo {
    static void main() {
        stud s = new stud("UJVL");
        s.display();
        stud s1 = new stud("Aman");
        s1.display();
        stud s2 = new stud("Aadi");
        s2.display();
        String[] arr = {"u", "v", "S"};
        System.out.println(arr.length);


    }


}
