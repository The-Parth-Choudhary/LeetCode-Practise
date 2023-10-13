package Array;

import java.util.Arrays;

public class Q378 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(kthSmallest(matrix, 8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n*n];
        int z = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[z++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);
        return arr[k-1];
    }
}
