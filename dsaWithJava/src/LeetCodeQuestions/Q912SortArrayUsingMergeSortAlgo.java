package LeetCodeQuestions;

public class Q912SortArrayUsingMergeSortAlgo {
    static void main() {
        int[] arr = {4,5,3,2,6,9,1,7};
        sortArray(arr);
        for(int e: arr) System.out.print(e + " ");

    }
    public static int[] sortArray(int[] arr){
        sortArr(arr);
        return arr;
    }
    public static void sortArr(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        int idx = 0;
        for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i<b.length; i++) b[i] = arr[idx++];
        sortArr(a);
        sortArr(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
