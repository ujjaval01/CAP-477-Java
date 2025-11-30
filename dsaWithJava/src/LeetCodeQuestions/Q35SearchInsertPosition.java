package LeetCodeQuestions;

public class Q35SearchInsertPosition {
    public static int searchInsert(int[] arr, int target) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        int j = 0;
        for(j = 0; j<arr.length; j++){
            if(arr[j] > target) return j;
        }
        return j;
    }
    static void main() {
        int[] arr = {2,3,5,7,8,9};
        int tar = 4;
        int res = searchInsert(arr, tar);
        System.out.println(res);

    }
}
