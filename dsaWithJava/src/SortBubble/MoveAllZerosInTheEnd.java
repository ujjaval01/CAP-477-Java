package SortBubble;

public class MoveAllZerosInTheEnd {
    static void main() {
        int[] arr = {3,5,0,0,4};

        int j = 0;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }
}
