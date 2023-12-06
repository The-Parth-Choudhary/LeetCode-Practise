package Random;

public class Q1716 {
    public static void main(String[] args) {
        System.out.println(totalMoney(32));
    }

    public static int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        int weekMoney = NthSum(weeks, 28, 7);
        int dayMoney = NthSum(days, weeks+1, 1);

        return weekMoney + dayMoney;
    }

    private static int NthSum(int n, int start, int diff){
        return (n)*(2*start + (n - 1)*diff)/2;
    }
}
