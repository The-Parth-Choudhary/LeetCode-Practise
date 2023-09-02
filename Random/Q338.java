package Random;

import java.util.Arrays;

public class Q338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n+1];

        int i = 0;

        while(i <= n){
            int temp = i;
            int cnt = 0;

            while(temp > 0){
                if((temp & 1) == 1){
                    cnt++;
                }
                temp = temp >> 1;
            }

            ans[i] = cnt;

            i++;
        }

        return ans;
    }
}
