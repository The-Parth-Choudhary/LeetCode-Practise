package Search;

public class Q374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        int s=0;
        int e=n;
        while(s<e){
            int mid = s+(e-s)/2;
            if(guess(mid)==0) return mid;
            else if(guess(mid)>0) s=mid+1;
            else e=mid-1;
        }
        return e;
    }

    private static int guess(int num) {
        if (num > 6) {
            return -1;
        } else if (num < 6) {
            return 1;
        } else {
            return 0;
        }
    }
}
