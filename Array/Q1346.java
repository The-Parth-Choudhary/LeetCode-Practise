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
}
