package Array;

import java.util.Arrays;

public class Q128 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int ans = 0;
        int currAns = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == 0){
                continue;
            }
            else if(nums[i] - nums[i - 1] == 1){
                currAns++;
            }
            else{
                ans = Math.max(ans, currAns);
                currAns = 1;
            }
        }

        ans = Math.max(ans, currAns);

        return ans;
    }
}
