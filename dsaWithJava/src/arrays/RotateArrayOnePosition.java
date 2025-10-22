package arrays;

public class RotateArrayOnePosition {
    static void main() {
        int[] arr = {2,5,7,6,8,3,9};
        int i = 0;
        int j = arr.length-1;
        System.out.print("Original array:  ");
        for(int a: arr){
            System.out.print(a + " ");
        }
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int k = 2;
        int l = arr.length-1;
        while (k < l){
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
        }
        System.out.println();
        System.out.print("Changed array: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}
