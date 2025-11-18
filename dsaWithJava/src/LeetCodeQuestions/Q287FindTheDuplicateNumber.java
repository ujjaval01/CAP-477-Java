package LeetCodeQuestions;

public class Q287FindTheDuplicateNumber {
    static void main() {
        int[] arr = {3,3,3,3,3,3
        };
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1) i++;
            else {
                int idx = arr[i] - 1;
                if(arr[i] == arr[idx]) return arr[i];
                swap(i, idx, arr);
            }
        }return arr[i];
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
