package Array;

import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        int[] nums ={3,4,-1,1};
        System.out.println(firstMissingPositive1(nums));
    }

//    Solution 1
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(max<nums[i]) max = nums[i];
        }
        int i=1;
        while(i<max){
            if(!set.contains(i)){
                return i;
            }
            else i++;
        }
        return max+1;
    }

//    Solution 2
    public static int firstMissingPositive1(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if((nums[i] > 0 && nums[i] < nums.length) && nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }

        return nums.length+1;
    }

        static void swap(int[] nums, int a, int b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
}
