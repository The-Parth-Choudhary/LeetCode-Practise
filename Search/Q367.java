package Search;

public class Q367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        long s=0;
        long e=num;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid==num) return true;
            else if(mid*mid<num) s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}
