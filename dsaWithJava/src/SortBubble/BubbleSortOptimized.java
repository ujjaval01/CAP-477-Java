package SortBubble;

public class BubbleSortOptimized {
    static void main(String[] args) {
        int[] arr = {4,5,8,3,1,2};
        sortArray(arr);
        for(int e: arr){
            System.out.print(e + " ");
        }

    }

    static void sortArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n-1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
