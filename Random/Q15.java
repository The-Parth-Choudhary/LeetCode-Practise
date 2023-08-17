package Random;

import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int target = nums[i]* -1;
            int low = i+1;
            int high = nums.length-1;

            while(low<high){
                if(nums[low]+nums[high]==target){
                    ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    while(nums[low]==nums[low-1] && low<high) low++;
                }
                else if(nums[low]+nums[high]<target) low++;
                else high--;
            }

        }

        return ans;
    }
}
