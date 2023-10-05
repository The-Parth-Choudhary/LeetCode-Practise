package Recursion;

public class Q326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(729));
    }

    public static boolean isPowerOfThree(int n) {
        return helper(n, 1);
    }

    private static boolean helper(int n, long a){
        if(a > n){
            return false;
        }

        if(a == n){
            return true;
        }

        return helper(n, a*3);
    }
}
