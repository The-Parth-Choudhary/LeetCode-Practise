package Recursion;

public class Q342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1024));
    }

    public static boolean isPowerOfFour(int n) {
        return helper(n, 1);
    }

    private static boolean helper(int n, long a){
        if(a > n){
            return false;
        }
        if(a == n){
            return true;
        }

        return helper(n, a*4);
    }
}
