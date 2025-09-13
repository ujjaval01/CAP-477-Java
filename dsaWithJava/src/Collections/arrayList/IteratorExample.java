package Collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class IteratorExample {
    static void main() {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mangoes");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add("Amrud");
        fruits.add("Vanshika");

        List<String> sub = fruits.subList(1,4);
        System.out.println(sub);

        System.out.println(fruits.subList(1,4));



//        for (int i =0; i<fruits.size(); i++){
//            System.out.print(fruits.get(i) + " ");
//        }
//
//        System.out.println();
//        for(String f: fruits){
//            System.out.print(f + " ");
//        }
//
//        System.out.println();
//        Iterator<String> fe = fruits.listIterator();
//        while (fe.hasNext()){
//            System.out.println(fe.next() + " ");
//        }
    }
}
