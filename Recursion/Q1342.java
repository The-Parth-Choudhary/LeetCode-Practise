package Recursion;

public class Q1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int cnt){
        if(num == 0){
            return cnt;
        }
        if(num % 2 == 0){
            return helper(num / 2, cnt + 1);
        }
        else{
            return helper(num - 1, cnt + 1);
        }
    }
}
