package arrays;

public class SecondLargestElement {
    static void main() {
        int[] arr = {8,4,9,5,9,6, 8,1,3,7};
        int max = 0;
        int secondMax = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j] != max && arr[j] > secondMax){
                secondMax = arr[j];
            }
        }
        System.out.println(secondMax);
    }
}
