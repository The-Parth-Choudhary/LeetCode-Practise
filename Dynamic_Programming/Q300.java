package Dynamic_Programming;

import java.util.*;

public class Q300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        Arrays.fill(l,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    l[i] = Math.max(l[i],l[j]+1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max,l[i]);
        }
        return max;
    }
}
