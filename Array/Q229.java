package Array;
import java.util.*;
public class Q229 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i : map.keySet()){
            if(map.get(i) > nums.length / 3){
                ans.add(i);
            }
        }

        return ans;
    }
}
