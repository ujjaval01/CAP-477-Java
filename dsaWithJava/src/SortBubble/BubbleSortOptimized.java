package SortBubble;

public class BubbleSortOptimized {
    static void main(String[] args) {

        sortArray();


    }

    static void sortArray(){
        int[] arr = {4,5,8,3,1,2};
        int n = arr.length;
       for(int i = 0; i< n-1; i++){
           for(int j = 0; j< n-i-1; j++){
               if(arr[j] > arr[i]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
        for(int e: arr){
            System.out.print(e + " ");
        }

    }
}
