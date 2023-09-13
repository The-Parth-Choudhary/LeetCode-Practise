package Search;

public class Q74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        System.out.println(searchMatrix(matrix, 11));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(matrix[mid / col][mid % col] == target){
                return true;
            }
            else if(matrix[mid / col][mid % col] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return false;
    }
}
