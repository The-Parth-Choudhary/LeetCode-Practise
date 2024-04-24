package Dynamic_Programming;

public class Q1137 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        for (int i = 3; i <= n; i++) {
            int temp = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = temp;
        }

        return n3;
    }
}
