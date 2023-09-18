package Array;

import java.util.Arrays;

public class Q75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for(int i = 0; i <= right;){
            if(nums[i] == 0){
                swap(nums, i++, left++);
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                swap(nums, i, right--);
            }
        }
    }

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
