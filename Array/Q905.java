package Array;

import java.util.Arrays;

public class Q905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int odd = nums.length - 1;

        while(even < odd){
            while(nums[even] % 2 == 0 && even < odd){
                even++;
            }

            while(nums[odd] % 2 == 1 && odd > even){
                odd--;
            }

            swap(nums, even, odd);
        }

        return nums;
    }

    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
