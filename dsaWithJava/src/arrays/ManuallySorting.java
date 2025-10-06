package arrays;

public class ManuallySorting {
    static void main() {
        int[] arr = {5,7,1,3,9,8,4};

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
