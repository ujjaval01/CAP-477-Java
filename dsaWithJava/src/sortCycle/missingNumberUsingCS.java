package sortCycle;

public class missingNumberUsingCS {
    static void main() {
        int[] arr = {1,3,4,2,6};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]) {
        // 2,4,5,1,3
        int n = 1 + arr.length;
        int  i = 0;
        while(i<arr.length){
            if(arr[i] == i + 1 || arr[i] == n) i++;
            else{
                int idx = arr[i]-1;
                swap(i, idx, arr);
            }
        }
        for(i = 0; i<arr.length; i++){
            if(arr[i] != i+1) return i+1;
        }return n;

    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
