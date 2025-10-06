package arrays;

import java.util.ArrayList;

public class BasicOne {
    public static void main(String[] args) {
//        String[][] name = {{"Ujvl","Vnsi" ,"Aman", "Aadi"},
//                           {"Ujvl","Vnsi" ,"Aman", "Aadi"}};
////        for (String[] strings : name) {
////            for (String string : strings) {
////                System.out.print(string + " ");
////            }
////            System.out.println();
////        }
//
//        for(int i = 0; i< name.length; i++){
//            for (int j = 0; j<name[i].length; j++){
//                System.out.print(name[i][j] + " ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(10);
        int i = 0;
        arr.remove(i);
        System.out.println(arr);




    }
}
