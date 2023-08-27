package StacksAndQueues;
import java.util.*;
public class Q1475 {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[prices.length];
        s.push(prices[prices.length-1]);
        ans[prices.length-1] = prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            while(!s.isEmpty() && s.peek()>prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=prices[i];
            }
            else ans[i] = prices[i]-s.peek();
            s.push(prices[i]);
        }
        return ans;
    }
}
