package arrays;

public class mergeTwoSortedArray {
    static void main() {
        int[] a = {1,3,5,6};
        int[] b = {2,3,4,7,9,11};
        int n = a.length + b.length;
        int[] c = new int[n];
        sortedArray(a, b,c);
        for(int ele: c){
            System.out.print(ele + " ");
        }

    }

    private static void sortedArray(int[] a, int[] b, int[] c) {

        int i = 0, j = 0, k= 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while (j< b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while (i< a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }

    }
}
