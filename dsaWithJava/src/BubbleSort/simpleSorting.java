package BubbleSort;

public class simpleSorting {
    static void main() {
        int[] arr = {60,20,50,40,30,10};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e:arr){
            System.out.print(e + " ");
        }

    }
}
