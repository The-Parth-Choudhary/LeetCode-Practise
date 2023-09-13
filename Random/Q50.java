package Random;

public class Q50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.69, 10));
    }

    public static double myPow(double x, int n) {
        if(n < 0){
            return 1 / helper(x, -1 * n);
        }

        return helper(x, n);
    }

    public static double helper(double x, int n){
        if(n == 0){
            return 1;
        }

        if(n % 2 == 0){
            return helper(x * x, n / 2);
        }

        return x * helper(x * x, n / 2);
    }
}
