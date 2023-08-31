package Array;

import java.util.Arrays;

public class Q645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
            else{
                i++;
            }
        }

        int[] ans = new int[2];
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans[0] = nums[j];
                ans[1] = j+1;
                break;
            }
        }

        return ans;
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
