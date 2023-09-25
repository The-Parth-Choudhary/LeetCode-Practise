package Greedy_Algo;

import java.util.Arrays;

public class Q2160 {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    public static int minimumSum(int num) {
        int[] arr = new int[4];

        int i = 0;
        while(num > 0){
            arr[i++] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);

        int sum = (arr[0] * 10 + arr[3]) + (arr[1] * 10 + arr[2]);

        return sum;
    }
}
