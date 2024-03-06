package String;

import java.util.*;

public class Q438 {
    public static void main(String[] args) {

    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < p.length(); i++){
            arr2[p.charAt(i)-'a']++;
        }

        int i = 0;
        int j = 0;

        while(j < s.length()){
            arr1[s.charAt(j)-'a']++;

            if(j-i+1 < p.length()){
                j++;
            }
            else{
                if(isEqual(arr1, arr2)){
                    ans.add(i);
                }
                arr1[s.charAt(i)-'a']--;
                j++;
                i++;
            }
        }

        return ans;
    }

    private static boolean isEqual(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}
