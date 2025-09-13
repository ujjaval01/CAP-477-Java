package arrays;

public class PrintNegativeElementOnly {
    static void main() {
        int[] arr = {5,8,1,-7,9,-3,-5};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
