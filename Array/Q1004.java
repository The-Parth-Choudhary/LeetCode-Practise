package Array;

import java.util.*;

public class Q1004 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(longestOnes(nums, 3));
    }

    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] == 1){
                j++;
                max = Math.max(max, j-i);
            }
            else if(k > 0){
                j++;
                k--;
                max = Math.max(max, j-i);
            }
            else{
                if(nums[i] == 0){
                    k++;
                }
                i++;
            }
        }

        return max;
    }
}
