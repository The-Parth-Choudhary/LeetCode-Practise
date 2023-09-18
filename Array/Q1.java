package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            else{
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
