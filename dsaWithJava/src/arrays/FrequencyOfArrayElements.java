package arrays;

import java.util.ArrayList;

public class FrequencyOfArrayElements {
    static void main() {
//        int[] arr = {10,20,20,10,30,10};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(10);
        int count = 1;
        // 10,20,20,10,30,10

        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j< arr.size(); j++){
                if(arr.get(i).equals(arr.get(j))){
                    count++;
                }
            }
            System.out.println("[" +arr.get(i) + "," +  count + "]");
            count = 1;
            arr.remove(i);
        }
    }
}

/*
package arrays;

import java.util.ArrayList;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(10);

        boolean[] visited = new boolean[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            if (visited[i]) continue;  // already counted element

            int count = 1;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("[" + arr.get(i) + ", " + count + "]");
        }
    }
}

*/
