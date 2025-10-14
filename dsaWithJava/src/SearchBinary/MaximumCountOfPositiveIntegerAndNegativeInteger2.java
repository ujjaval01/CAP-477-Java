package SearchBinary;

public class MaximumCountOfPositiveIntegerAndNegativeInteger2 {
    public static void main(String[] args) {
        int[] nums = {-5, -2, -1, 0, 0, 1, 2, 3, 4, 5, 6};
        int res = maximumCount(nums);
        System.out.println(res);
    }

    static int maximumCount(int[] nums) {
        int n = nums.length;

        // Find first positive number index
        int firstPos = firstPositiveIndex(nums);

        // Find last negative number index
        int lastNeg = lastNegativeIndex(nums);

        int negCount = lastNeg + 1; // index + 1 = count of negatives
        int posCount = n - firstPos; // from first positive till end

        return Math.max(negCount, posCount);
    }

    static int firstPositiveIndex(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length; // default: if no positive found
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int lastNegativeIndex(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = -1; // default: if no negative found
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
