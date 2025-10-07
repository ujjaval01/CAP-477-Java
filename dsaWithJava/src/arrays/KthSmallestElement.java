package arrays;

public class KthSmallestElement {
    static void main() {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 2;
        int res = findElement(arr,k);
        System.out.println(res);

    }

    private static int findElement(int[] arr, int k) {
        for(int i = 0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = i;
            for(int j = i; j< arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr[k - 1];
    }
}
