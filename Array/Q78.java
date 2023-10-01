package Array;

import java.util.*;

public class Q78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        helper(nums, 0, subset, ans);

        return ans;
    }

    private static void helper(int[] nums, int index, List<Integer> subset, List<List<Integer>> ans){
        if(index >= nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        helper(nums, index + 1, subset, ans);

        subset.add(nums[index]);
        helper(nums, index + 1, subset, ans);
        subset.remove(subset.size() - 1);
    }
}
