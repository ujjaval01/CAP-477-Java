package Collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleExample {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter how many element u want to add in the list: ");
        int elNum = sc.nextInt();
        for (int i = 1; i<=elNum; i++){
            System.out.print("Enter your " + i + " element: ");
            int el = sc.nextInt();
            list.add(el);
        }
        System.out.println(list);

//        List <Integer> al = new ArrayList<>();
//        al.add(55);      // adding the element in the list
//        al.add(80);
//        al.add(75);
//        al.add(15);
//        System.out.println(al);
//
//        System.out.println(al.get(1));   // getting the index value
//
//        al.remove(1);         // remove the element of the given index in the list
//        System.out.println(al);
//
////        al.clear();                 // Clear all the list element
//        System.out.println(al);
//
//        System.out.println(al.size()); // Checking how many elements present in the list
//
//        System.out.println( al.contains(15));  // Check is the element is present in the list or not
//
//        System.out.println(al.isEmpty()); // check the list is empty or not

    }
}
