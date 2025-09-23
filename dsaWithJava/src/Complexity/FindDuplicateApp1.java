package Complexity;

public class FindDuplicateApp1 {
    static void main() {
        int[] arr = {5,1,3,4,2,4};
        boolean[] flag = new boolean[arr.length];
        for(int i = 0; i< arr.length; i++){
            int ele = arr[i];
            if(flag[ele]) System.out.println("Duplicate found...");
            else flag[ele] = true;
        }


    }
}
