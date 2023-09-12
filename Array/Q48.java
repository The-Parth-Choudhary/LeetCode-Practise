package Array;

import java.util.Arrays;

public class Q48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        return;
    }

//    public static void rotate(int[][] matrix) {
//        int n = matrix.length;
//
//        int[][] ans = new int[n][n];
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                ans[j][n - 1 - i] = matrix[i][j];
//            }
//        }
//
//        for(int i = 0; i < n; i++){
//            for(int  j = 0; j < n ; j++){
//                matrix[i][j] = ans[i][j];
//            }
//        }
//
//        return;
//    }
}
