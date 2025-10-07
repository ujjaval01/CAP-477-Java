package SortSelection;

public class selectionSortWithLstIndx {

    static void main() {
        int[] arr = {2,4,1,5,3,7,6,9,8};
        sort(arr);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            int maxIndex = i;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }
    }
}
