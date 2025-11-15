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
                int temp = arr[i];
                arr[i] = arr[val-1];
                arr[val-1] = temp;
            }
        }
        return arr;
    }
//    public static int swap(int a, int b, int[] arr){
//
//    }
}
