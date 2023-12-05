package Random;

public class Q1688 {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }

    public static int numberOfMatches(int n) {
        int ans = 0;

        while(n > 1){
            ans += n / 2;

            if(n % 2 == 0){
                n = n / 2;
            }
            else{
                n = n / 2 + 1;
            }
        }

        return ans;
    }
}
