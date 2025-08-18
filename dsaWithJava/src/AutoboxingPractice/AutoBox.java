package AutoboxingPractice;

import java.util.ArrayList;

public class AutoBox {
    static void main() {
        int a = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        for (Integer integer : list) {
            a = integer;
            System.out.print(a + " ");
        }

    }
}
