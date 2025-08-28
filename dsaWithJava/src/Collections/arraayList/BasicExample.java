package Collections.arraayList;

import java.util.ArrayList;

public class BasicExample {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(7);
        arr.add(5);
        arr.add(8);
        arr.remove(1);
        for (int arrOutput: arr){
            System.out.println(arrOutput);
        }
    }
}
