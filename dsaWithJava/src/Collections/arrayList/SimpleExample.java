package Collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SimpleExample {
    static void main() {
        List <Integer> al = new ArrayList<>();
        al.add(55);      // adding the element in the list
        al.add(80);
        al.add(75);
        al.add(15);
        System.out.println(al);

        System.out.println(al.get(1));   // getting the index value

        al.remove(1);         // remove the element of the given index in the list
        System.out.println(al);

//        al.clear();                 // Clear all the list element
        System.out.println(al);

        System.out.println(al.size()); // Checking how many elements present in the list

        System.out.println( al.contains(15));  // Check is the element is present in the list or not

        System.out.println(al.isEmpty()); // check the list is empty or not

    }
}
