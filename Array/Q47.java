package Array;

import java.util.*;

public class Q47 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2};
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        helper(nums, 0, set, ans);

        return ans;
    }

    private static void helper(int[] nums, int index, HashSet<List<Integer>> set, List<List<Integer>> ans){
        if(index >= nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums){
                permutation.add(num);
            }

            if(!set.contains(permutation)){
                set.add(permutation);
                ans.add(permutation);
                return;
            }
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);
            helper(nums, index+1, set, ans);
            swap(nums, i, index);
        }
    }

    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
