package Array;
import java.util.*;
public class Q229 {
    public static void main(String[] args) {
        int[] nums = {4,2,1,1};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//
//        for(int i : nums){
//            if(map.containsKey(i)){
//                map.put(i, map.get(i) + 1);
//            }
//            else{
//                map.put(i, 1);
//            }
//
//            if(map.get(i) > nums.length / 3){
//                list.add(i);
//                map.put(i, Integer.MIN_VALUE);
//            }
//        }
//
//        return list;

//        Optimized Ans
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1++;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1 != nums[i]){
                cnt2++;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]){
                cnt1++;
            }
            else if(ele2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(ele1 == nums[i]){
                cnt1++;
            }
            else if(ele2 == nums[i]){
                cnt2++;
            }
        }

        int min = nums.length / 3;
        if(cnt1 > min){
            list.add(ele1);
        }
        if(cnt2 > min){
            list.add(ele2);
        }

        return list;
    }
}
