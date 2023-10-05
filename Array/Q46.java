package Array;

import java.util.*;

public class Q46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums, 0, ans);

        return ans;
    }

    private static void helper(int[] nums, int index, List<List<Integer>> ans){
        if(index >= nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums){
                permutation.add(num);
            }

            ans.add(permutation);
            return;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);

            helper(nums, index + 1, ans);

            swap(nums, i, index);
        }
    }

    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
