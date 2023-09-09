package Array;

public class Q11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxi = 0;

        while(left < right){
            int width = right - left;
            int length = Math.min(height[left], height[right]);

            int area = area(length, width);
            maxi = Math.max(maxi, area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxi;
    }

    private static int area(int a, int b){
        return a * b;
    }
}
