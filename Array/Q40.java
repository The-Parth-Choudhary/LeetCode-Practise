package Array;

import java.util.*;

public class Q40 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        helper(candidates, target, 0, set, ans);

        return ans;
    }

    private static void helper(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i - 1]){
                continue;
            }

            if(candidates[i] > target){
                break;
            }

            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}
