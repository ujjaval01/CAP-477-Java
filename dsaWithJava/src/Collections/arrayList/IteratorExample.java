package Collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {
    static void main() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mangoes");
        fruits.add("Banana");
        fruits.add("Papaya");

        for (int i =0; i<fruits.size(); i++){
            System.out.print(fruits.get(i) + " ");
        }

        System.out.println();
        for(String f: fruits){
            System.out.print(f + " ");
        }

        System.out.println();
        Iterator<String> fe = fruits.listIterator();
        while (fe.hasNext()){
            System.out.println(fe.next() + " ");
        }
    }
}
