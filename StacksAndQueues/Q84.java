package StacksAndQueues;
import java.util.*;
public class Q84 {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

    public static int[] nextSmaller(int[] heights, int n){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        s.push(-1);
        for(int i=n-1;i>=0;i--){
            while(s.peek()!=-1 && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }

    public static int[] prevSmaller(int[] heights, int n){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        s.push(-1);
        for(int i=0;i<n;i++){
            while(s.peek()!=-1 && heights[s.peek()]>heights[i]){
                s.pop();
            }
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] next = new int[n];
        next = nextSmaller(heights, n);

        int[] prev = new int[n];
        prev = prevSmaller(heights, n);

        int ans= 0;

        for(int i=0;i<n;i++){
            int l = heights[i];

            if(next[i]==-1){
                next[i]=n;
            }

            int b = next[i] - prev[i] - 1;

            ans = Math.max(ans, l*b);
        }
        return ans;
    }
}
