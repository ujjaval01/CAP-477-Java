package sortInsertion;

public class InsertionSort {
    static void main() {
        int[] arr = {12,11,13,5,6};
        for(int i = 1; i< arr.length; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}
