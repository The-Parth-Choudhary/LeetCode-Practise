package Search;

import java.util.*;

public class Q167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(numbers[0],0);
        int[] ans = new int[2];
        for(int i=1;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                if(numbers[i]<target-numbers[i]){
                    ans[0] = i+1;
                    ans[1] = map.get(target-numbers[i])+1;
                }
                else{
                    ans[0] = map.get(target-numbers[i])+1;
                    ans[1] = i+1;
                }
            }
            else map.put(numbers[i],i);
        }
        return ans;
    }
}
