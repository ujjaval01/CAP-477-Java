package SearchBinary;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    static void main() {
        int[] nums = {-5,-2,-1,0,0,1,2,3,4,5,6};
        int res = maximumCount(nums);
        System.out.println(res);
    }
      static int maximumCount(int[] nums) {
           int pos = 0, neg = 0;
           for (int num : nums) {
               if (num > 0) pos++;
               else if (num < 0) neg++;
           }
           return Math.max(pos, neg);
       }
   }
