package arrays;

public class CountPairSum {
    static void main() {
        int[] a = {1,3,5,7};
        int[] b = {2,3,5,8};
        int x = 10;
        int res = findPair(a,b,x);
        System.out.println(res);
    }
    static int findPair(int[] a, int[] b, int x){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if(a[i] + b[j] == x){
                    count++;
                }
            }
        }
        return count;
    }
}
