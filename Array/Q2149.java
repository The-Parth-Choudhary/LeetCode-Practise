package Array;

import java.util.Arrays;

public class Q2149 {
    public static void main(String[] args) {
        int[] nums = {39, -8, -28, 46, -16, -21, -12, 49, 14, -46, 22, 9};

        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int m = nums.length;
        int[] pos = new int[m / 2];
        int[] neg = new int[m / 2];
        int p=0;
        int n=0;

        for(int i = 0; i < m; i++){
            if(nums[i] > 0){
                pos[p] = nums[i];
                p++;
            }
            else{
                neg[n] = nums[i];
                n++;
            }

        }

        for(int i = 0; i < m / 2 ;i++){
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }

        return nums;
    }
}
