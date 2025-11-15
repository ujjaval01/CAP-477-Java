package sortCycle;

public class cycleSortBasic {
    static void main() {
        int[] arr = {2,4,5,1,3};
        sort(arr);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
    public static int[] sort(int[] arr){
        // 2,4,5,1,3
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1) i++;
            else {
                int val = arr[i];
                swap(i, val-1, arr);
            }
        }
        return arr;
    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
