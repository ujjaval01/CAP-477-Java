package arrays;

public class mergeThreeSortedArray {
    static void main() {
        int[] a = {2,4,6,8,9};
        int[] b = {7,11,12,15,15,17};
        int[] c = {1,3,5,7,10};
        int[] d = new int[a.length+ b.length+ c.length];
        sortedArray(a,b,c,d);
        for (int ele: d){
            System.out.println(ele + " ");
        }

    }

    private static void sortedArray(int[] a, int[] b, int[] c, int[] d) {
        int i = 0, j = 0, k= 0, l = 0;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i] < b[j] && a[i]< c[k]){
                d[l] = a[i];
                i++;
                l++;
            } else if (b[j] < a[i] && b[j] < c[k]) {
                d[l] = b[j];
                j++;
                k++;
            }else{
                d[l] = c[k];
                k++;
                l++;
            }
        }
        while (i==a.length && j != b.length){


        }
    }
}
