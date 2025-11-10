package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class gfgUnionOfTwoSortedArray {
    static void main() {
        int[] a = {1,3,4,5,6};
        int[] b = {1,2,3};
        ArrayList<Integer> res = findUnion(a,b);
        System.out.println(res);
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        // a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
        while (i<a.length && j<b.length){
            if(a[i] == b[j]){
                if(!ans.contains(a[i])){
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                if(!ans.contains(a[i])){
                    ans.add(a[i]);
                }
                i++;

            }else if(b[j] < a[i]){
                if(!ans.contains(b[j])){
                    ans.add(b[j]);
                }
                j++;
            }
        }
        if(i<a.length){
            while(i<a.length){
                if(!ans.contains(a[i])){
                    ans.add(a[i]);
                }
                i++;
            }
        }
        if(j<b.length){
            while(j<b.length){
                if(!ans.contains(b[j])){
                    ans.add(b[j]);
                }
                j++;
            }
        }

        return ans;
    }
}
