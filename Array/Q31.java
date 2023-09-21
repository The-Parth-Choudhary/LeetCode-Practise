package Array;

import java.util.Arrays;

public class Q31 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5};
        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums, 0, n - 1);

            return;
        }

        for(int i = n - 1; i >= idx; i--){
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        reverse(nums, idx + 1, n - 1);
    }

    private static void reverse(int[] nums, int a, int b){
        while(a < b){
            int temp = nums[a];
            nums[a++] = nums[b];
            nums[b--] = temp;
        }
    }
}
