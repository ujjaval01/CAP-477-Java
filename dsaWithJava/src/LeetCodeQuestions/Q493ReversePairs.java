package LeetCodeQuestions;

public class Q493ReversePairs {
    static int count;
    static void main() {
        int[] arr = {1,3,2,3,1};
        System.out.println(reversePairs(arr));
    }


    public static int reversePairs(int[] arr) {
        count = 0;
        mergeSort(arr);
        return count;
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n <= 1) return;

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0;i<mid;i++) left[i] = arr[i];
        for(int i=0;i<n-mid;i++) right[i] = arr[mid+i];

        mergeSort(left);
        mergeSort(right);

        // 👉 correct counting before merge
        int j = 0;
        for(int i = 0; i < left.length; i++){
            while(j < right.length && (long)left[i] > 2L * right[j]){
                j++;
            }
            count += j;
        }

        merge(left, right, arr);
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
}
