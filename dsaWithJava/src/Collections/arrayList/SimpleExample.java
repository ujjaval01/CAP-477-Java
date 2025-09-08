package Collections.arrayList;

import java.util.ArrayList;

public class SimpleExample {
    static void main() {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(55);
        al.add(80);
        al.add(75);
        System.out.println(al);

        System.out.println(al.get(1));
        System.out.println(al.remove(2));

    }
}
