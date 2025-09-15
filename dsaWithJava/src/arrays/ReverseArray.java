package arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {10,52,7,5,77,3,65,52,48,96};
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int n: arr){
            System.out.print(n + " ");
        }
    }

}
