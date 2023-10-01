package Array;

import java.util.*;

public class Q39 {
    public static void main(String[] args) {
        int[] nums = {2,3,5};

        System.out.println(combinationSum(nums, 11));
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums, target, new ArrayList<>(), 0, ans);

        return ans;
    }

    private static void helper(int[] nums, int target, List<Integer> set, int index, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(set));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < nums.length; i++){
            set.add(nums[i]);
            helper(nums, target - nums[i], set, i, ans);
            set.remove(set.size() - 1);
        }
    }
}
