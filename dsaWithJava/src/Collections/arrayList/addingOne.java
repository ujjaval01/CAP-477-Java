package Collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class addingOne {
    static void main() {
        // 4599
        int[] arr = {4,5,6,7,8,9};
        Solution s = new Solution();

        System.out.println(s.addOne(arr));

    }
}
class Solution{
    Vector<Integer> addOne(int[] arr){
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for(int i = n-1; i>= 0; i--){
            if((arr[i] + carry) <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);

        return ans;
    }
}
