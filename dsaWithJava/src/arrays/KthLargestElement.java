package arrays;

public class KthLargestElement {
    static void main() {
        int[] arr = {7, 10, 4, 3, 20, 15};
        // 3 4 7 10 15 20
        int k = 2;
        int res = findElement(arr,k);
        System.out.println(res);

    }

    private static int findElement(int[] arr, int k) {
        for(int i = 0; i<k; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[arr.length-k];
    }
}
