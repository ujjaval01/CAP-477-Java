package SortSelection;

public class SelectionSorting {
    static void main() {
        int[] arr = {2,4,1,5,3,7,6,9,8};
        sort(arr);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }
}
