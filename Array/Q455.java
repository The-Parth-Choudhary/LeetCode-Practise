package Array;

import java.util.Arrays;

public class Q455 {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int cnt= 0;

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                cnt++;
                i++;
            }
            j++;
        }

        return cnt;
    }
}
