package Array;

import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        int[] nums ={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

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
}
