package Collections.arrayList;

import java.util.ArrayList;

public class PrintingElementsIn2dArrayList {
    static void main() {
       // {{10,20,30,40},{11,21,31,41},{12,22,32,42}}
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30); a.add(40);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(11); b.add(21); b.add(31); b.add(41);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(12); c.add(22); c.add(32); c.add(42);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);  arr.add(b);   arr.add(c);

//        for(int i = 0; i<arr.size(); i++){
//            for(int j = 0; j< arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer> list: arr){
            for(int ele: list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
