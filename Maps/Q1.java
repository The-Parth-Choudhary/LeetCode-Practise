package Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                if(map.get(target-nums[i])<i){
                    ans[0]=map.get(target-nums[i]);
                    ans[1]=i;
                }
                else{
                    ans[0]=i;
                    ans[1] = map.get(target-nums[i]);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
