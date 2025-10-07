package arrays;

public class TwoSumIfArrayIsSorted {
    public static void main(String[] args) {  // ✅ correct signature
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] nums = twoSum(numbers, target);

        for(int e: nums){
            System.out.print(e + " ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) return new int[] {i + 1, j + 1};
            else if (sum > target) j--;
            else i++;
        }

        return new int[] {};
    }
}
