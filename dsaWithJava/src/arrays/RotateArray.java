package arrays;

public class RotateArray {
    static void main() {
        int[] arr = {8,4,9,5,9,6, 8,1,3,7};
        int d = 2;
        int n = arr.length;
        // 9,5,9,6,8,1,3,7,8,4
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
        for (int a: arr){
            System.out.print(a + " ");
        }
        System.out.println(arr.length);

    }
    static void rotate(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
