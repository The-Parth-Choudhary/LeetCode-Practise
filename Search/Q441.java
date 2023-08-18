package Search;

public class Q441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {
        int i=1,cnt=0;
        while(n>0){
            n=n-i;
            i++;
            if(n>=0) cnt++;
        }
        return cnt;
    }
}
