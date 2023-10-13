package Array;

import java.util.*;

public class Q2133 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        System.out.println(checkValid(matrix));
    }

    public static boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            Set<Integer> setRow = new HashSet<>();
            Set<Integer> setCol = new HashSet<>();

            for(int j = 0; j < n; j++){
                setRow.add(matrix[i][j]);
                setCol.add(matrix[j][i]);
            }

            if(setRow.size() != n || setCol.size() != n){
                return false;
            }
        }

        return true;
    }
}
