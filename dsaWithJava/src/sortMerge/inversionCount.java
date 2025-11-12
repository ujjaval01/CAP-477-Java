package sortMerge;

public class inversionCount {
    static int count;
    static void main() {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
    public static int inversionCount(int arr[]) {
        // Code Here
        count = 0;
        mergeSort(arr);
        return count;

    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i<b.length; i++) b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i<a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else{
                count+=(a.length-i);
                c[k++] = b[j++];
            }
        }
        while (i<a.length) c[k++] = a[i++];
        while (j<b.length) c[k++] = b[j++];
    }
}
