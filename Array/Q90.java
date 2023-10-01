package Array;

import java.util.*;

public class Q90 {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 1, 4};

        System.out.println(subsetsWithDup(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        helper(nums, 0, subset, ans);

        return ans;
    }

    private static void helper(int[] nums, int index, List<Integer> subset, List<List<Integer>> ans){
        ans.add(new ArrayList<>(subset));

        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i - 1]){
                continue;
            }

            subset.add(nums[i]);
            helper(nums, i + 1, subset, ans);
            subset.remove(subset.size() - 1);
        }
    }
}
