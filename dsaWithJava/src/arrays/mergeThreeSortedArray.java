package arrays;

public class mergeThreeSortedArray {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9};
        int[] b = {7,11,12,15,15,17};
        int[] c = {1,3,5,7,10};
        int[] d = new int[a.length + b.length + c.length];
        sortedArray(a, b, c, d);
        for (int ele: d){
            System.out.print(ele + " ");
        }
    }

    private static void sortedArray(int[] a, int[] b, int[] c, int[] d) {
        int i = 0, j = 0, k = 0, l = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] < b[j] && a[i] < c[k]) {
                d[l++] = a[i++];
            } else if (b[j] < a[i] && b[j] < c[k]) {
                d[l++] = b[j++];
            } else {
                d[l++] = c[k++];
            }
        }

        // agar koi array khatam ho gaya to baaki do ko merge karo
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) d[l++] = a[i++];
            else d[l++] = b[j++];
        }
        while (i < a.length && k < c.length) {
            if (a[i] < c[k]) d[l++] = a[i++];
            else d[l++] = c[k++];
        }
        while (j < b.length && k < c.length) {
            if (b[j] < c[k]) d[l++] = b[j++];
            else d[l++] = c[k++];
        }

        // leftover
        while (i < a.length) d[l++] = a[i++];
        while (j < b.length) d[l++] = b[j++];
        while (k < c.length) d[l++] = c[k++];
    }
}
