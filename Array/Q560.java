package Array;

import java.util.HashMap;

public class Q560 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(subarraySum(nums, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        int sum = 0;

        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}
