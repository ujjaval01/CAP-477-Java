package SortBubble;

public class ReverseSorting {
    static void main() {
        int[] arr = {1,2,5,3,4};
        int n = arr.length;
        sortArray(arr,n);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }


    static void sortArray(int[] arr, int n){

        for(int i = 0; i< n-1; i++){
            boolean flag = false;
            for(int j = 0; j< n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }

    }
}
