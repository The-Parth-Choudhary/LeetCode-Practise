package Array;

import java.util.*;

public class Q2461 {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(nums, 3));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        int i = 0;
        int j = 0;
        long max = 0;

        while(j < nums.length){
            if(!set.contains(nums[j]) && j-i+1 <= k){
                set.add(nums[j]);
                sum += nums[j];
                if(j-i+1 == k){
                    max = Math.max(max, sum);
                }
                j++;
            }
            else{
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return max;
    }
}
