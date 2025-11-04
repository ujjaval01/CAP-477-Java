package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q78Subsets {
    static void main() {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(new ArrayList<>(), nums, 0, list);
        return list;
    }

    public static void helper(List<Integer> ans, int[] nums, int idx, List<List<Integer>> list) {
        if (idx == nums.length) {
            list.add(new ArrayList<>(ans));
            return;
        }

        // include current element
        ans.add(nums[idx]);
        helper(ans, nums, idx + 1, list);

        // exclude current element
        ans.remove(ans.size() - 1);
        helper(ans, nums, idx + 1, list);
    }
}
