package Array;

import java.util.*;

public class Q1346 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Double> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]*2.0) || set.contains(arr[i]/2.0)) {
                return true;
            }
            else {
                set.add(arr[i] * 1.0);
            }
        }

        return false;
    }

    public static class Q350 {
        public static void main(String[] args) {
            int[] nums1 = {4,9,5};
            int[] nums2 = {9,4,9,8,4};
            System.out.println(Arrays.toString(intersect(nums1, nums2)));
        }

        public static int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> l = new ArrayList<>();

            for(int i=0;i<nums1.length;i++){
                map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
            }

            for(int i=0;i<nums2.length;i++){
                if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                    l.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i])-1);
                }
            }
            int[] arr = new int[l.size()];
            for(int i=0;i<l.size();i++){
                arr[i] = l.get(i);
            }
            return arr;
        }
    }
}
