package Array;

import java.util.HashMap;

public class Q1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for(int num : nums){
            if(map.containsKey(num)){
                cnt += map.get(num);
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        return cnt;
    }
}
