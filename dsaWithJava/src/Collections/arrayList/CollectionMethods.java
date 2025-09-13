package Collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionMethods {
    static void main() {
        List<Integer> list = new ArrayList<>();      //list 1
        list.add(55);
        list.add(45);
        list.add(23);
        list.add(89);

//        List<Integer> list2 = new ArrayList<>();      //list 2
//        list.add(41);
//        list.add(42);
//        list.add(43);
//        list.add(45);


        System.out.println(list);
//        for(int al: list){             // printing each element using for each loop
//            System.out.println(al);
//        }

//        list.remove(Integer.valueOf(55));    // remove particular element in the list
//        list.remove(1);                  // remove element from the given index

//        System.out.println(list.size());        //size, how many elements present in the list

//        list.clear();        // clear all the elements in the list

//        list.addAll();

//        list.retainAll(list2);


//        // convert to array
//        Object[] a = list.toArray();
//        for (Object arr: a){
//            int temp = (Integer) arr;
//            System.out.println(temp);
//        }

//        System.out.println(list.getFirst());      //getting first element
//        System.out.println(list.getLast());       // getting last element
//        System.out.println(list.getClass());     //getting class

//        list.set(1,66);     // replace

//        try{
//            list.add(5,71);
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            System.out.println(list);
//        }
//        list.remove(1);
//        System.out.println(list);
        list.remove( Integer.valueOf(55));
        System.out.println(list);



    }

}
