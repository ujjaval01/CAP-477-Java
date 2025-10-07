package arrays;

import java.util.EnumSet;

public class TwoSumIfArrayIsSorted {
    static void main() {
        int[] numbers = {2,11,6,7,15};
        int target = 9;
        int[] nums = twoSum(numbers,target);
        System.out.print("Target sum found on ");
        for(int e: nums){
            System.out.print("Index " + e + ", ");
        }



    }
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target) return new int[] {i+1, j+1};
            else if(numbers[i] + numbers[j] > target) j--;
            else  if(numbers[i] + numbers[j] < target) i++;
        }
        return new int[] {};
    }

}
