package arrays;

public class ManuallySorting {
    static void main() {
        int[] arr = {5,7,1,3,9,8,4};
        int l = arr.length;
        for(int i = 0; i< l-1; i++){
            for (int j = 0; j < l - 1- i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
