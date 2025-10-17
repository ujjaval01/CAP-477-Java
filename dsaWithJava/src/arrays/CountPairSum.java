package arrays;
/*Given two sorted arrays arr1 and arr2 of distinct elements.
Given a value x. The problem is to count all pairs from both arrays whose sum equals x.
Note: The pair has an element from each array.
Examples:
Input: x = 10, arr1[] = [1, 3, 5, 7], arr2[] = [2, 3, 5, 8]
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).  */

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
